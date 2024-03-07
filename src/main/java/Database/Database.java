package Database;

import com.google.gson.JsonArray;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.swing.JOptionPane.showMessageDialog;

public class Database {
    
    // create an object of Database
    private static Database connectionInstance = new Database();

    private Database() {
    }

    public static Database getConnectionInstance() {
        if (connectionInstance == null)
            connectionInstance = new Database();
        return connectionInstance;
    }
    
    // connect to the database
    public Connection connect() {
        String connectionString = "jdbc:derby:derbydb2;create=true";
        Connection connection= null;
        try {
            connection = DriverManager.getConnection(connectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }
    
    // create a table City 
    public void createTableCity() {
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            String createSQL = "CREATE TABLE City" +
                               "(Name varchar(255) NOT NULL," +
                        "Location varchar(50)," +
                        "Country varchar(50)," +
                        "Latitude varchar(10)," +
                        "Logitude varchar(10)," +
                        "Apperance integer DEFAULT 1," +
                        "PRIMARY KEY (Name))";
            statement.executeUpdate(createSQL);
            statement.close();
            connection.close();
            System.out.println("Done!");

        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
        }
    }

    // create a table MeteoData
    public void createTableMeteoData() {
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            String createSQL = "CREATE TABLE MeteoData" +
                        "(CityName      varchar(255) NOT NULL REFERENCES City(Name),"+ 
                        "Datetime      varchar(20) NOT NULL," +
                        "Temp_C       double precision," +
                        "Humidity      integer," +
                        "Uv      integer," +
                        "WindspeedKmph double precision," +
                        "WeatherDesc   varchar(255)," +
                        "unique (CityName, Datetime))";

            statement.executeUpdate(createSQL);
            statement.close();
            connection.close();
            System.out.println("Done!");
        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
        }
    }

    public void createCityDate() {
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            String createSQL = "CREATE TABLE CityDate (" +
                    "  CityName      varchar(255) NOT NULL REFERENCES City(Name)," +
                    " SearchDate varchar(20) NOT NULL)";
            statement.executeUpdate(createSQL);
            statement.close();
            connection.close();
            System.out.println("Done!");
        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
        }
    }


    public void insertNewCity(String Name, String Country, String Region, String Latitude,
                              String Logitude, int Apperance, String Search_Date) throws SQLException {
        try {
            Connection connection = connect();
            String insertSQL = "Insert into City values(?,?,?,?,?,?)";
            String insertSQL2 = "Insert into CityDate values(?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            PreparedStatement preparedStatement2 = connection.prepareStatement(insertSQL2);
            preparedStatement.setString(1, Name);
            preparedStatement.setString(2, Region);
            preparedStatement.setString(3, Country);
            preparedStatement.setString(4, Latitude);
            preparedStatement.setString(5, Logitude);
            preparedStatement.setInt(6, Apperance);
            preparedStatement.executeUpdate();
            preparedStatement2.setString(1, Name);
            preparedStatement2.setString(2, Search_Date);
            preparedStatement2.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
            Connection connection = connect();
            String insertSQL2 = "Insert into CityDate values(?,?)";
            String updateSQL = String.format("Update City SET APPERANCE = APPERANCE + 1 WHERE NAME = '%s' ", Name);
            PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);
            PreparedStatement preparedStatement2 = connection.prepareStatement(insertSQL2);
            preparedStatement2.setString(1, Name);
            preparedStatement2.setString(2, Search_Date);
            preparedStatement2.executeUpdate();
            preparedStatement.executeUpdate();
        }
    }

    public void insertMeteoData(String Name, String Datetime, double Temp_C, int Humidity, int Uvindex,
                              double WindSpeed, String WetherDesc) {
        try {
            Connection connection = connect();
            String insertSQL = "Insert into MeteoData values(?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, Name);
            preparedStatement.setString(2, Datetime);
            preparedStatement.setDouble(3, Temp_C);
            preparedStatement.setInt(4, Humidity);
            preparedStatement.setInt(5, Uvindex);
            preparedStatement.setDouble(6, WindSpeed);
            preparedStatement.setString(7, WetherDesc);
            int count = preparedStatement.executeUpdate();
            if (count > 0) {
                showMessageDialog(null, "Meteo Data added to the db");
            } else {
                showMessageDialog(null, "Something went wrong. Check the exception");
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
            showMessageDialog(null, "Data already exits");
        }
    }

    public List<String> selectAllCitys() {
        List<String> CityList = new ArrayList<>();
        String CityName;
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            String selectSQL = "Select * from City";
            ResultSet rs = statement.executeQuery(selectSQL);
            while (rs.next()) {
                CityName = rs.getString("Name");
                CityList.add(CityName);
            }
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
        }
        return CityList;
    }

    public List<List> selectCitysbyApperance() {
        List<String> data;
        List<List> CityList = new ArrayList<>();
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            String selectSQL = "Select * from City ORDER BY APPERANCE DESC";
            ResultSet rs = statement.executeQuery(selectSQL);
            while (rs.next()) {
                String City = rs.getString("NAME");
                String Region = rs.getString("LOCATION");
                String Country = rs.getString("COUNTRY");
                String Lat = rs.getString("LATITUDE");
                String Lon = rs.getString("LOGITUDE");
                String Appearance = rs.getString("APPERANCE");
                data = List.of(new String[]{City, Region, Country, Lat, Lon, Appearance});
                CityList.add(data);
            }
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
        }
        return CityList;
    }

    public List<List> selectMeteoDataByCity(String Querry) {
        List<String> data;
        List<List> CityData = new ArrayList<>();
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            String selectSQL = "Select * from METEODATA WHERE CITYNAME = '" +Querry+ "' ";
            ResultSet rs = statement.executeQuery(selectSQL);
            while (rs.next()) {
                String City = rs.getString("CITYNAME");
                String Datetime = rs.getString("DATETIME");
                String Temperature = rs.getString("TEMP_C");
                String Humidity = rs.getString("HUMIDITY");
                String Uv = rs.getString("UV");
                String Wind = rs.getString("WINDSPEEDKMPH");
                String Description = rs.getString("WEATHERDESC");
                data = List.of(new String[]{City, Datetime, Temperature, Humidity, Uv, Wind, Description});
                CityData.add(data);
            }
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
        }
        return CityData;
    }

    public List<List> selectSerchedTimesByCity(String Querry) {
        List<String> data;
        List<List> SearchedDate = new ArrayList<>();
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            String selectSQL = "Select * from CITYDATE WHERE CITYNAME = '" +Querry+ "' ";
            ResultSet rs = statement.executeQuery(selectSQL);
            while (rs.next()) {
                String City = rs.getString("CITYNAME");
                String Datetime = rs.getString("SEARCHDATE");
                data = List.of(new String[]{City, Datetime});
                SearchedDate.add(data);
            }
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
        }
        return SearchedDate;
    }

    public void DeleteDataByCity(String Querry) {
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            String deleteSQL = "Delete from METEODATA WHERE CITYNAME = '" +Querry+ "' ";
            statement.executeUpdate(deleteSQL);
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
        };
    }
}