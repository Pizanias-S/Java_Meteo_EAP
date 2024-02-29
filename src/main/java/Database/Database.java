package Database;

import java.sql.*;
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
        String connectionString = "jdbc:derby:derbydb2;create=true";  // this should change to the final DB name
        Connection connection = null;
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
                        "Code varchar(10)," + 
                        "Latitude varchar(10)," + 
                        "Logitude varchar(10)," + 
                        "Airport_Code varchar(10)," + 
                        "Apperance integer," + 
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
}