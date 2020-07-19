package managedBean;

import AdminUI.AdminCommandFactory;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "clearScreen")
@SessionScoped
public class ClearScreen implements Serializable {

    //Attributes
    private int screenID;
    
    //Getter and setter method

    public int getScreenID() {
        return screenID;
    }

    public void setScreenID(int screenID) {
        this.screenID = screenID;
    }
   
    public void clearScreen() {
        AdminCommandFactory.createCommand(AdminCommandFactory.CLEAR_SCREEN, screenID).execute();
    }
    
}
