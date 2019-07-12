
package bookingclass.entities;

/**
 *
 * @author Aldana
 */
public class Slot {
    private int ID;
    private Student student;
    private String subject;
    private int price;
    private String status;
    private Class classes;
    private String comment;

    public Slot() {
    }

    public Slot(int ID, Student student, String subject, int price, String status, Class classes, String comment) {
        this.ID = ID;
        this.student = student;
        this.subject = subject;
        this.price = price;
        this.status = status;
        this.classes = classes;
        this.comment = comment;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Class getClasses() {
        return classes;
    }

    public void setClasses(Class classes) {
        this.classes = classes;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
}
