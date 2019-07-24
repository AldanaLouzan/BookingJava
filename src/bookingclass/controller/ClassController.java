package bookingclass.controller;

import bookingclass.entity.Classes;
import dao.ClassesDaoImpl;
import java.util.ArrayList;


/**
 *
 * @author Eoin
 */
public class ClassController {
    ClassesDaoImpl data = new ClassesDaoImpl();
    
    //Store time available for the type of class and date selected
    public ArrayList<Integer> classType(Classes c){
        
        ArrayList <Integer> timeAvailable = new ArrayList();
        String classType = c.getType();
        
        if (classType == "private" || classType == "in-group"){
            timeAvailable = data.selectEmptyClass(c.getDate()); //Select depending on the type of class
            
        }else{
            timeAvailable = data.selectSemiprivateClass(c.getDate());   //Select if class = semiprivate
        }
        return timeAvailable;
        
    }
    
}
