package gateway;

import dto.CustomerDTO;
import dto.TicketDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import manager.DatabaseManager;

public class TicketGateway extends DatabaseManager {

    public boolean bookTicket(TicketDTO ticketDTO) {
        boolean insertOK = false;
        try {
            Connection conn = getConnection();

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Ticket(customerid, cinemaid, filmid, bookingdate, quantity) values (?,?,?,?,?)");

            stmt.setInt(1, ticketDTO.getCustomerID());
            stmt.setInt(2, ticketDTO.getCinemaID());
            stmt.setInt(3, ticketDTO.getFilmID());
            stmt.setDate(4, ticketDTO.getBookingDate());
            stmt.setInt(5, ticketDTO.getQuantity());

            int rows = stmt.executeUpdate();

            insertOK = rows == 1;

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return insertOK;
    }

    public ArrayList<TicketDTO> viewTicket() {
        ArrayList<TicketDTO> tickets = new ArrayList<>();
        try {
            Connection conn = getConnection();

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM ticket");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                TicketDTO ticket = new TicketDTO(rs.getInt("ticketid"), rs.getInt("customerid"), rs.getInt("cinemaid"), rs.getInt("filmid"), rs.getInt("quantity"), rs.getDate("bookingdate"));
                tickets.add(ticket);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException sqle) {
        }
        return tickets;
    }

    public boolean cancelTicket(int ticketID) {
        boolean deleteOK = false;
        try {
            Connection conn = getConnection();

            PreparedStatement stmt = conn.prepareStatement("DELETE FROM Ticket WHERE ticketid = ?");

            stmt.setInt(1, ticketID);
            stmt.executeUpdate();
            
            deleteOK = true;
            
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return deleteOK;
    }
}
