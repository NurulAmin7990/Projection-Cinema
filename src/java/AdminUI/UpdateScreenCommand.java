package AdminUI;

import dto.ScreenDTO;
import manager.ScreenManager;

public class UpdateScreenCommand implements AdminCommand{
    
    //Attributes
    private int screenID;
    private ScreenDTO screenDTO;
    private final ScreenManager screenManager;
    
    //Methods
    public UpdateScreenCommand(int screenID, ScreenDTO screenDTO){
        this.screenID = screenID;
        this.screenDTO = screenDTO;
        screenManager = new ScreenManager();
    }
    
    @Override
    public Object execute(){
        return screenManager.updateScreen(screenID, screenDTO);
    }
    
}
