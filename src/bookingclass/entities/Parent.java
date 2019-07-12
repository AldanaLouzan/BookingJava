package bookingclass.entities;

/**
 *
 * @author Aldana
 */
public class Parent extends Person {

    private String phone;

    public Parent() {
    }

    public Parent(String phone) {
        this.phone = phone;
    }

    public Parent(String phone, String name, String surname) {
        super(name, surname);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
