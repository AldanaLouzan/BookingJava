package bookingclass.entity;

import java.util.Date;

/**
 *
 * @author Aldana
 */
public class Class {
    private int idClass;
    private Date date;
    private int time;
    private String type;

    public Class() {
    }

    public Class(int id, Date date, int time, String type) {
        this.idClass = id;
        this.date = date;
        this.time = time;
        this.type = type;
    }

    public int getId() {
        return idClass;
    }

    public void setId(int id) {
        this.idClass = id;
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
