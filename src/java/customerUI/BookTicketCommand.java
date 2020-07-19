package customerUI;

import dto.TicketDTO;
import manager.TicketManager;

public class BookTicketCommand implements CustomerCommand{
    
    //Attributes
    private final TicketDTO ticketDTO;
    private final TicketManager ticketManager;
    
    //Methods
    public BookTicketCommand(TicketDTO ticketDTO){
        this.ticketDTO = ticketDTO;
        ticketManager = new TicketManager();
    }
    
    //Overide method
    @Override
    public Object execute(){
        return ticketManager.bookTicket(ticketDTO);
    }
}
