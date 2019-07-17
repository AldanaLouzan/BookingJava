package bookingclass.db;

import bookingclass.entity.Student;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CRUD
        
{

    private String message;
    DBConnection db = new DBConnection ();
    
    public void insertStudentUnder18(Student st) {
        Connection con = db.getConnetion();
        PreparedStatement pst = null;
        String sql = "INSERT INTO STUDENT (idstudent, s_name, s_surname, phone, email, birth, age, college, level, idparent) "
                + "VALUES(??,?,?,?,?,?,?,?,?)";

        try {
            pst = con.prepareStatement(sql);

            pst.setInt(1, st.getId());
            pst.setString(2, st.getName());
            pst.setString(3, st.getSurname());
            pst.setString(4, st.getPhone());
            pst.setString(5, st.getEmail());
            pst.setDate(6, (Date) st.getBirth());
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
            
            con.close();
    
        } catch (Exception e) {
            System.err.println(e);
        }

        //return message;
    }

    public String modifyStudent(Connection con, Student st){
        return message;
    }
    
    public String eliminateStudent(Connection con, int id){
        return message;
    }
       
    
    public void showStudent(){
        
    }
}
