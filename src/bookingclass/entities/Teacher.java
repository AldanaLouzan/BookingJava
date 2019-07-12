package bookingclass.entities;

/**
 *
 * @author Aldana
 */
public class Teacher extends Person {

    private int ID;

    public Teacher() {
    }

    public Teacher(int ID) {
        this.ID = ID;
    }

    public Teacher(int ID, String name, String surname) {
        super(name, surname);
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
