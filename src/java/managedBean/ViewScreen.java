package managedBean;

import customerUI.CustomerCommandFactory;
import dto.ScreenDTO;
import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "viewScreen")
@RequestScoped
public class ViewScreen {

    //Method
    public ArrayList<ScreenDTO> viewScreen() {
        ArrayList<ScreenDTO> screens = (ArrayList<ScreenDTO>) CustomerCommandFactory.createCommand(CustomerCommandFactory.VIEW_SCREEN).execute();
        return screens;
    }
}
