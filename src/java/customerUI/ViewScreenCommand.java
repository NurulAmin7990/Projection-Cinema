package customerUI;

import manager.ScreenManager;

public class ViewScreenCommand implements CustomerCommand {

    //Attributes
    private final ScreenManager screenManager;

    //Methods
    public ViewScreenCommand() {
        screenManager = new ScreenManager();
    }

    @Override
    public Object execute() {
        return screenManager.viewScreen();
    }
}
