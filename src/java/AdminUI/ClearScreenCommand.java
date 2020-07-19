package AdminUI;

import manager.ScreenManager;

public class ClearScreenCommand implements AdminCommand{
    
    //Attributes
    private int screenID;
    private final ScreenManager screenManager;
    
    //Methods
    public ClearScreenCommand(int screenID){
        this.screenID = screenID;
        screenManager = new ScreenManager();
    }
    
    @Override
    public Object execute(){
        return screenManager.clearScreen(screenID);
    }
    
}
