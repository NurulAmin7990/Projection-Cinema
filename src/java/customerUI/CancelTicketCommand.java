package customerUI;

import manager.TicketManager;

public class CancelTicketCommand implements CustomerCommand{
    
    //Attributes
    private int ticketID;
    private final TicketManager ticketManager;
    
    //Methods
    public CancelTicketCommand(int ticketID){
        this.ticketID = ticketID;
        ticketManager = new TicketManager();
    }
    
    @Override
    public Object execute(){
        return ticketManager.cancelTicket(ticketID);
    }
}
