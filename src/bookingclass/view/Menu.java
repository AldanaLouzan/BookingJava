package bookingclass.view;

import bookingclass.controller.MenuController;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Aldana
 */
public class Menu {

    public Menu() throws ParseException {
        MenuController mc = new MenuController();
        
        
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
                    mc.registration();  
                    //new Menu();;
                    break;
                }
                case "2": {
                    mc.logIn();
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
