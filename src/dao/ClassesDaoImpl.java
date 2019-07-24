package dao;

import static bookingclass.connectionDb.DBConnection.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Eoin
 */
public class ClassesDaoImpl {

    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    //Obtain time available for classes type = private or type = in-group 
    public ArrayList<Integer> selectEmptyClass(Date d) {
        ArrayList<Integer> timeAvailable = new ArrayList();
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int date = cal.get(Calendar.DATE);
        LocalDate choosenDate = LocalDate.of(year, month, date);
        
        Connection con = null;
        
        String sql = "SELECT time "
                + "FROM classes "
                + "WHERE type = 'empty' "
                + "AND date = '" + choosenDate + "';";

        try {
            con = getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                int time = 0;
                time = rs.getInt("time");
                timeAvailable.add(time);
            }
            con.commit();
            con.close();

        } catch (Exception e) {
            System.err.println(e);
        }
        return timeAvailable;

    }
    
    //Obtain time available for classes type = private or type = in-group 
    public ArrayList<Integer> selectSemiprivateClass(Date d) {
        ArrayList<Integer> timeAvailable = new ArrayList();
        
        //Getting from object Date only the Day
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int date = cal.get(Calendar.DATE);
        LocalDate choosenDate = LocalDate.of(year, month, date);
        
        Connection con = null;
        String sql = "SELECT time "
                + "FROM classes "
                + "WHERE (type = 'empty' OR type = 'semiprivate')"
                + " AND quantity_students < 4 "
                + " AND date = '" + choosenDate + "';";

        try {
            con = getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                int time = 0;
                time = rs.getInt("time");
                timeAvailable.add(time);
            }
            con.commit();
            con.close();

        } catch (Exception e) {
            System.err.println(e);
        }
        return timeAvailable;

    }

}
