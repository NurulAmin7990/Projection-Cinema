package managedBean;

import customerUI.CustomerCommandFactory;
import dto.TicketDTO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;

@Named(value = "viewTicket")
@SessionScoped
public class ViewTicket implements Serializable {

    //Method
    public ArrayList<TicketDTO> viewTicket() {
        ArrayList<TicketDTO> tickets = (ArrayList<TicketDTO>) CustomerCommandFactory.createCommand(CustomerCommandFactory.VIEW_TICKET).execute();
        return tickets;
    }

}
