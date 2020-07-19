package manager;

import dto.TicketDTO;
import gateway.TicketGateway;
import java.util.ArrayList;

public class TicketManager {
    
    //Attributes
    private TicketGateway ticketGateway = new TicketGateway();
    
    //Methods
    public boolean bookTicket(TicketDTO ticketDTO){
        return ticketGateway.bookTicket(ticketDTO);
    }
    
    public ArrayList<TicketDTO> viewTicket(){
        return ticketGateway.viewTicket();
    }
    
    public boolean cancelTicket(int ticketID){
        return ticketGateway.cancelTicket(ticketID);
    }
    
}
