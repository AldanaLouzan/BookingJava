
package bookingclass.controller;

import bookingclass.entity.Parent;
import bookingclass.entity.Student;
import java.util.HashMap;
import java.util.Map;

public class ParentController 
{
    
    Map<Integer, Parent> parentRegistered = new HashMap();
    
    public void parentTable(Parent p) {

    if(p.getIdParent() == 0) {
        int parentID = this.parentID();
        p.setIdParent(parentID);

    }
    parentRegistered.put(p.getIdParent(), p);

}

    public int parentID() {
        int tempID = (int) (Math.random() * 2000 + 1000);
        int ID = 0;
        if (parentRegistered.containsKey(tempID) == true) {
            tempID = (int) (Math.random() * 2000 + 1000);
            ID = tempID;
        } else {
            ID = tempID;
        }

        return ID;

    }
}
