package Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
    public java.sql.Connection connect() {
        String connectionString = "jdbc:derby:derbydb2;create=true";
        Connection connection= null;
        try {
            connection = DriverManager.getConnection(connectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(connection);
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
                        "Code varchar(10)," +
                        "Latitude varchar(10)," +
                        "Logitude varchar(10)," +
                        "Airport_Code varchar(10)," +
                        "Apperance integer DEFAULT 1," +
                        "Search_Date date NOT NULL," +
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
                        "Datetime      date NOT NULL," + 
                        "Temp_C       float(6)," +
                        "Humidity      integer," +
                        "Uv      integer," +
                        "WindspeedKmph varchar(20)," +
                        "WeatherDesc   varchar(255)," +
                        "PRIMARY KEY (CityName))";

            statement.executeUpdate(createSQL);
            statement.close();
            connection.close();
            System.out.println("Done!");
        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
        }
    }


    public void insertNewCity(String Name, String Location, String Code, String Latitude,
                              String Logitude, String Airport_Code, int Apperance, Date Search_Date) {
        try {
            java.sql.Connection connection = connect();
            String insertSQL = "Insert into City values(?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, Name);
            preparedStatement.setString(2, Location);
            preparedStatement.setString(3, Code);
            preparedStatement.setString(4, Latitude);
            preparedStatement.setString(5, Logitude);
            preparedStatement.setString(6, Airport_Code);
            preparedStatement.setInt(7, Apperance);
            preparedStatement.setDate(8, Search_Date);
            int count = preparedStatement.executeUpdate();
            if (count > 0) {
                System.out.println("City added to the db");
            } else {
                System.out.println("Something went wrong. Check the exception");
            }
            preparedStatement.close();
            connection.close();
             System.out.println("Done!");
        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
        }
    }

    public void insertMeteoData(String Name, Date Datetime, double Temp_C, int Humidity,
                              String WindSpeed, String WetherDesc) {
        try {
            java.sql.Connection connection = connect();
            String insertSQL = "Insert into MeteoData values(?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, Name);
            preparedStatement.setDate(2, Datetime);
            preparedStatement.setDouble(3, Temp_C);
            preparedStatement.setInt(4, Humidity);
            preparedStatement.setString(5, WindSpeed);
            preparedStatement.setString(6, WetherDesc);
            int count = preparedStatement.executeUpdate();
            if (count > 0) {
                System.out.println("Meteo Data added to the db");
            } else {
                System.out.println("Something went wrong. Check the exception");
            }
            preparedStatement.close();
            connection.close();
            System.out.println("Done!");
        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
        }
    }

    public List<String> selectAllCitys() {
        List<String> CityList = new ArrayList<>();
        String CityName;
        try {
            java.sql.Connection connection = connect();
            Statement statement = connection.createStatement();
            String selectSQL = "Select * from City";
            ResultSet rs = statement.executeQuery(selectSQL);
            while (rs.next()) {
                CityName = rs.getString("Name");
                CityList.add(CityName);
            }
            statement.close();
            connection.close();
            System.out.println("Done!");
            System.out.print(CityList);
        } catch (SQLException throwables) {
            System.out.println(throwables.getLocalizedMessage());
        }
        return CityList;
    }
}