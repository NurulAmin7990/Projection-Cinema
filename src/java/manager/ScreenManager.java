package manager;

import dto.ScreenDTO;
import gateway.ScreenGateway;
import java.util.ArrayList;

public class ScreenManager {
    
    //Attributes
    private ScreenGateway screenGateway = new ScreenGateway();
    
    //Methods
    public ArrayList<ScreenDTO> viewScreen(){
        return screenGateway.viewScreen();
    }
    
    public boolean updateScreen(int screenID, ScreenDTO screenDTO){
        return screenGateway.updateScreen(screenID, screenDTO);
    }
    
    public boolean clearScreen(int screenID){
        return screenGateway.clearScreen(screenID);
    }
}
