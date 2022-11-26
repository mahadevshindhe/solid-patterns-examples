package solid.singleresponsibility.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {


    private static DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();
    private Connection connection;

    public static DatabaseConnectionManager getManagerInstance() {
        return connectionManager;
    }

    public void connect() {

        /*try {
            connection = DriverManager.getConnection("url");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/
        System.out.println("Established database connection...");
    }

    public Connection getConnectionObject() {
        return connection;
    }

    public void disconnect() throws SQLException {
        connection.close();
        System.out.println("Disconnected from Database");
    }
}
