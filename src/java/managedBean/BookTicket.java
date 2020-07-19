
package managedBean;

import customerUI.CustomerCommandFactory;
import dto.TicketDTO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Date;

@Named(value = "bookTicket")
@SessionScoped
public class BookTicket implements Serializable {

    //Attribute
    private int cinemaID;
    private int filmID;
    private int customerID;
    private String bookingDate;
    private int quantity;
    private TicketDTO ticketDTO;
    
    //Getter and setter method

    public int getCinemaID() {
        return cinemaID;
    }

    public void setCinemaID(int cinemaID) {
        this.cinemaID = cinemaID;
    }

    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    //Method
    
    public void bookTicket() {
        Date bookingDateSQL=Date.valueOf(bookingDate);
        ticketDTO = new TicketDTO(cinemaID, filmID, customerID, quantity, bookingDateSQL);
        CustomerCommandFactory.createCommand(CustomerCommandFactory.BOOK_TICKET, ticketDTO).execute();
    }
    
    //Validator
}
