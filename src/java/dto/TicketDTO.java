package dto;

import java.sql.Date;

public class TicketDTO {
    
    //Attributes
    private int ticketID;
    private int cinemaID;
    private int filmID;
    private int customerID;
    private int quantity;
    private Date bookingDate;
    
    //Constructor
    public TicketDTO(int ticketID, int cinemaID, int filmID, int customerID, int quantity, Date bookingDate) {
        this.ticketID = ticketID;
        this.cinemaID = cinemaID;
        this.filmID = filmID;
        this.customerID = customerID;
        this.quantity = quantity;
        this.bookingDate = bookingDate;
    }
    
        public TicketDTO(int cinemaID, int filmID, int customerID, int quantity, Date bookingDate) {
        this.ticketID = ticketID;
        this.cinemaID = cinemaID;
        this.filmID = filmID;
        this.customerID = customerID;
        this.quantity = quantity;
        this.bookingDate = bookingDate;
    }
    
    //Getter and setter
    public int getTicketID() {
        return ticketID;
    }

    public int getCinemaID() {
        return cinemaID;
    }

    public int getFilmID() {
        return filmID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }
    
    //To string
    @Override
    public String toString() {
        return "TicketDTO{" + "ticketID=" + ticketID + ", cinemaID=" + cinemaID + ", filmID=" + filmID + ", customerID=" + customerID + ", quantity=" + quantity + ", bookingDate=" + bookingDate + '}';
    }
    
}
