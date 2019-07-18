package bookingclass.db;

import static bookingclass.db.DBConnection.getConnection;
import bookingclass.entity.Student;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

public class CRUD
        
{

    PreparedStatement pst;
    ResultSet rs;
    
    
    public void insertStudentUnder18(Student st) {
        Connection con = null;
        
        String sql = "INSERT INTO STUDENT (idstudent, s_name, s_surname, phone, email, birth, age, college, level, idparent) "
                + "VALUES(??,?,?,?,?,?,?,?,?)";

        try {
            
            con = getConnection();
            pst = con.prepareStatement(sql);
            

            pst.setInt(1, st.getId());
            pst.setString(2, st.getName());
            pst.setString(3, st.getSurname());
            pst.setString(4, st.getPhone());
            pst.setString(5, st.getEmail());
            pst.setDate(6, Date.valueOf(st.getBirth()));
            pst.setInt(7, st.getAge());
            pst.setString(8, st.getCollege());
            pst.setString(9, st.getLevel());
            pst.setInt(10, st.getParent().getIdParent());
            
            int res = pst.executeUpdate();
            
            if(res > 0){
                //JOptionPane.showMessageDialog(null, "You have been registered");
                System.out.println("You have been registered");
            }else{
                //JOptionPane.showMessageDialog(null, "Error");
                System.out.println("Error");
            }
            
            //con.close();
    
        } catch (Exception e) {
            System.err.println(e);
        }


    }
    
        public void insertStudentOver18(Student st) {
        Connection con = null;
        
        String sql = "INSERT INTO STUDENT (idstudent, s_name, s_surname, phone, email, birth, age, college, level) "
                + "VALUES(?,?,?,?,?,?,?,?,?)";

        try {
            
            con = getConnection();
            pst = con.prepareStatement(sql);
            

            pst.setInt(1, st.getId());
            pst.setString(2, st.getName());
            pst.setString(3, st.getSurname());
            pst.setString(4, st.getPhone());
            pst.setString(5, st.getEmail());
            pst.setDate(6, Date.valueOf(st.getBirth()));
            pst.setInt(7, st.getAge());
            pst.setString(8, st.getCollege());
            pst.setString(9, st.getLevel());
           
            int res = pst.executeUpdate();
            
            if(res > 0){
                //JOptionPane.showMessageDialog(null, "You have been registered");
                System.out.println("You have been registered");
            }else{
                //JOptionPane.showMessageDialog(null, "Error");
                System.out.println("Error");
            }
            
            //con.close();
    
        } catch (Exception e) {
            System.err.println(e);
        }


    }


}
