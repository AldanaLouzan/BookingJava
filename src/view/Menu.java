package view;

import bookingclass.controllers.MenuController;
import bookingclass.controllers.StudentController;
import bookingclass.entities.Parent;
import bookingclass.entities.Student;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Aldana
 */
public class Menu {

    public Menu() throws ParseException {
        MenuController mc = new MenuController();
        Student st = new Student();
        
        String choice = null;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("<<<<< Welcome <<<<<");
        System.out.println("Pleas select one option");
        System.out.println("(1) Register");
        System.out.println("(2) Log-in");
        
        
        do {
            choice = scan.nextLine();
            switch (choice) {
                case "1": {
                    mc.registerForm();  
                    new Menu();;
                    break;
                }
                case "2": {
                    mc.LogIn();
                    ;
                    break;
                }           
            
            default: {
                    System.out.println("You chose and invalid option. Please, try again");
                    new Menu();
                    break;
            }
            }//end of switch

        }while (!choice.equals("7")); // end of loop do-while

    }

}
