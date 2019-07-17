package bookingclass.controller;

import bookingclass.entity.Student;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Aldana
 */
public class StudentController {
/**
    Map<Integer, Student> studentRegistered = new HashMap();

    public void StudentTable(Student st) {
        
        if (st.getId() == 0) {
            int  studentID = this.StudentID();
            st.setID(studentID);

        }

        studentRegistered.put(st.getId(), st);

    }

    public int StudentID() {
        int tempID = (int) (Math.random() * 1000 + 1);
        int ID = 0;
        if (studentRegistered.containsKey(tempID) == true) {
            tempID = (int) (Math.random() * 1000 + 1);
            ID = tempID;
        }
        else{
            ID = tempID;
        }
            
        return ID;

    }
*/
}
