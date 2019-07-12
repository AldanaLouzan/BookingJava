package bookingclass.entities;

import java.util.Date;

/**
 *
 * @author Aldana
 */
public class Class {
    private int ID;
    private Date date;
    private int time;
    private String type;

    public Class() {
    }

    public Class(int ID, Date date, int time, String type) {
        this.ID = ID;
        this.date = date;
        this.time = time;
        this.type = type;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
    
}
