package Database;

import Swing.PopupDialogInfo;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.JOptionPane.showMessageDialog;

public class Database {
    
    // create an object of Database
    private static Database connectionInstance = new Database();
    private JFrame parentFrame;

    private Database() {
    }

    public static Database getConnectionInstance() {
        // Method to get the connection Instance
        if (connectionInstance == null)
            connectionInstance = new Database();
        return connectionInstance;
    }
    
    // connect to the database
    public Connection connect() {
        // Method to connect to the db and create it if it doesn't exist
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
        // SQL Create to initialize the City table if it doesn't exist
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
        // SQL Create to initialize the MeteoData table if it doesn't exist
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
        // SQL Create to initialize the CityDate table if it doesn't exist
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
        // SQL INSERT to add city data to the db
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
        // SQL INSERT to add meteo data to the db
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
                PopupDialogInfo notification = new PopupDialogInfo(parentFrame);
                notification.init();
                notification.setInfo("Weather data saved to DB");
                Timer timer = new Timer(1500, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        notification.setVisible(false);
                        notification.dispose();
                    }
                });
                timer.setRepeats(false);
                timer.start();

                notification.setVisible(true);
            } else {
                showMessageDialog(null, "Something went wrong. Check the exception");
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
            PopupDialogInfo notification = new PopupDialogInfo(parentFrame);
            notification.init();
            notification.setInfo("Data already exists");
            Timer timer = new Timer(1500, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    notification.setVisible(false);
                    notification.dispose();
                }
            });
            timer.setRepeats(false);
            timer.start();

            notification.setVisible(true);
        }
    }

    public List<String> selectAllCitys() {
        // SQL SELECT to select all city data
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
        // SQL SELECT to select all city data and sort them by appearance
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
        // SQL SELECT to select meteo data using cityname
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
        // SQL SELECT to select searched data using cityname
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

    public List<String> selectMeteoDataByDateCitys(String Querry) {
        // SQL SELECT to select Datetime from meteo data using cityname
        List<String> DateList = new ArrayList<>();
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            String selectSQL = "Select DATETIME from METEODATA WHERE CITYNAME = '" +Querry+ "' ";
            ResultSet rs = statement.executeQuery(selectSQL);
            while (rs.next()) {
                String DateName = rs.getString("DATETIME");
                DateList.add(DateName);
            }
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
        }
        return DateList;
    }

    public List<String> selectMeteoDataByDateandCity(String Querry1, String Querry2) {
        // SQL SELECT to select Meteo data using cityname and datetime
        List<String> DateCityList = new ArrayList<>();
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            String selectSQL = "Select * from METEODATA WHERE CITYNAME = '" +Querry1+ "' AND DATETIME = '" +Querry2+ "' ";
            ResultSet rs = statement.executeQuery(selectSQL);
            while (rs.next()) {
                String temperature = rs.getString("TEMP_C");
                String humidity = rs.getString("HUMIDITY");
                String uv = rs.getString("UV");
                String wind_speed = rs.getString("WINDSPEEDKMPH");
                String weather_desc = rs.getString("WEATHERDESC");
                DateCityList.add(temperature);
                DateCityList.add(humidity);
                DateCityList.add(uv);
                DateCityList.add(wind_speed);
                DateCityList.add(weather_desc);
            }
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
        }
        return DateCityList;
    }

    public void updateMeteoDataByDateandCity(String city, String date, double temp, int humidity, int uv,
                                             double wind, String weather) {
        // SQL Update to update Meteo data using cityname and datetime
        try {
            Connection connection = connect();
            String updateSQL = "UPDATE MeteoData SET TEMP_C=" +temp+ ", HUMIDITY=" +humidity+ ", UV=" +uv+ ", " +
                    "WINDSPEEDKMPH=" +wind+ ", WEATHERDESC='" +weather+ "' " +
                    "WHERE CITYNAME = '" +city+ "' AND DATETIME = '" +date+ "' ";
            PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);
            preparedStatement.executeUpdate();
            PopupDialogInfo notification = new PopupDialogInfo(parentFrame);
            notification.init();
            notification.setInfo("Weather data for "+city+" and "+date+" edited in the DB");
            Timer timer = new Timer(2500, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    notification.setVisible(false);
                    notification.dispose();
                }
            });
            timer.setRepeats(false);
            timer.start();

            notification.setVisible(true);

            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
            PopupDialogInfo notification = new PopupDialogInfo(parentFrame);
            notification.init();
            notification.setInfo("Something went wrong. Check the exception");
            Timer timer = new Timer(1500, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    notification.setVisible(false);
                    notification.dispose();
                }
            });
            timer.setRepeats(false);
            timer.start();

            notification.setVisible(true);
        }
    }
}
