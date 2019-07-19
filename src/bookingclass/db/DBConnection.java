package bookingclass.db;

import java.sql.Connection;
import java.sql.*;
 
public class DBConnection {
/**
    private static Connection connection = null;
    private static String url = "jdbc:mysql://localhost:3306/test";
    private static String user = "root";
    private static String pass = "";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
            connection.setAutoCommit(false);
            System.out.println("Connection successful");
        } catch (SQLException ex) {
            System.out.println("Database exception: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("General exception: " + ex.getMessage());
        } 
        finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println("Exception closing connection: " + ex);
                }
            }
        }
        return connection;

    }
    */

}
