package viewInterface;

import bookingclass.controller.MenuController;
import bookingclass.entity.Classes;
import bookingclass.entity.Parent;
import bookingclass.entity.Slot;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author Eoin
 */
public interface IMenu {
   public void registration()throws ParseException;
   public Parent parentDetails();
   
   public void logIn() throws ParseException;
   public void privatePageNav(int studentID) throws ParseException;
   public void myAccount(int studentID) throws ParseException;
   public void bookForm(int studentID) throws ParseException;
   public void chooseClassType(Classes c) throws ParseException;
   public void chooseDate(Classes c) throws ParseException;
   public void showTimeAvailable(ArrayList<Classes> timeAvailable, Classes c);
   public String subjectChosen ();
   public String comment ();
   public void showBooking (Classes c, Slot s, int previousQS);

}
