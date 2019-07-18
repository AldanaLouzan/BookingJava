
package bookingclass;

import bookingclass.db.DBConnection;
import static bookingclass.db.DBConnection.getConnection;
import java.text.ParseException;
import bookingclass.view.Menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author Aldana
 */
public class BookingClass {

    //private static Connection connection = null;
    //private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws ParseException, ClassNotFoundException, SQLException {
        Connection con = getConnection();
        Menu m = new Menu();
        
    }
        
/**        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

            // Display the main menu of options
            String choice = "";
            do {
                System.out.println("\n--------------------------------------------------------------");
                System.out.println("1. Select all SQL");
                System.out.println("2. Insert new users");
                System.out.println("3. Quit");
                
                System.out.println("\n====>");

                choice = br.readLine();

                if (choice.equals("1")) {                    
                    selectSQL();
                } else if (choice.equals("2")) {
                    //do the insert statement
                    selectSQL();
                }
            } while (!choice.equals("3"));
            
        } catch (SQLException ex) {
            System.out.println("Database exception: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("General exception: " + ex.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println("Exception closing connection: " + ex);
                }
            }
        }
        
        
        //Menu m = new Menu ();
        
        
    }
    
    public static void selectSQL() throws SQLException, IOException {
        String sql = "SELECT id,name,surname FROM test.usuarios";

        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next() != false) {
            System.out.println("ID:  " + rs.getInt(1));
            System.out.println("Name: " + rs.getString(2));
            System.out.println("Surname: " + rs.getString(3));
            System.out.println();
        }
    }
    **/
}
