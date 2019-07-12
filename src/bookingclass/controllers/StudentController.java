package bookingclass.controllers;

import bookingclass.entities.Student;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Aldana
 */
public class StudentController {

    Map<Integer, Student> studentRegistered = new HashMap();

    public void StudentTable(Student st) {
        Student s = new Student();
        s = st;
        int studentID;
        if (s.getID() == 0) {
            studentID = this.StudentID();
            s.setID(studentID);

        }

        studentRegistered.put(s.getID(), s);

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

}
