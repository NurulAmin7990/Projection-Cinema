package customerUI;

import dto.CustomerDTO;
import dto.TicketDTO;

public class CustomerCommandFactory {

    //Attributes
    public static final int REGISTER_CUSTOMER = 1;
    public static final int BOOK_TICKET = 2;
    public static final int VIEW_TICKET = 3;
    public static final int CANCEL_TICKET = 4;
    public static final int VIEW_CINEMA = 5;
    public static final int VIEW_SCREEN = 6;
    public static final int VIEW_FILM = 7;

    //Methods
    public static CustomerCommand createCommand(int commandType, CustomerDTO customerDTO) {
        switch (commandType) {
            case REGISTER_CUSTOMER:
                return new RegisterCustomerCommand(customerDTO);
            default:
                return null;
        }
    }

    public static CustomerCommand createCommand(int commandType, TicketDTO ticketDTO) {
        switch (commandType) {
            case BOOK_TICKET:
                return new BookTicketCommand(ticketDTO);
            default:
                return null;
        }
    }

    public static CustomerCommand createCommand(int commandType, int ticketID) {
        switch (commandType) {
            case CANCEL_TICKET:
                return new CancelTicketCommand(ticketID);
            default:
                return null;
        }
    }

    public static CustomerCommand createCommand(int commandType) {
        switch (commandType) {
            case VIEW_TICKET:
                return new ViewTicketCommand();
            case VIEW_CINEMA:
                return new ViewCinemaCommand();
            case VIEW_SCREEN:
                return new ViewScreenCommand();
            case VIEW_FILM:
                return new ViewFilmCommand();
            default:
                return null;
        }
    }
}
