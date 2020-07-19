package customerUI;

import manager.TicketManager;

public class ViewTicketCommand implements CustomerCommand{
    
    //Attributes
    private final TicketManager ticketManager;
    
    //Methods
    public ViewTicketCommand(){
        ticketManager = new TicketManager();
    }
    
    @Override
    public Object execute(){
        return ticketManager.viewTicket();
    }
}
