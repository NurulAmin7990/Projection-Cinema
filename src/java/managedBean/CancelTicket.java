package managedBean;

import customerUI.CustomerCommandFactory;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "cancelTicket")
@SessionScoped
public class CancelTicket implements Serializable {

    //Attribute
    private int ticketID;

    //Getter and setter
    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    //Method
    public void cancelTicket() {
        CustomerCommandFactory.createCommand(CustomerCommandFactory.CANCEL_TICKET, ticketID).execute();
    }
}
