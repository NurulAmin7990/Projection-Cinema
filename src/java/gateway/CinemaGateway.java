package gateway;

import dto.CinemaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import manager.DatabaseManager;

public class CinemaGateway extends DatabaseManager {

    public ArrayList<CinemaDTO> viewCinema() {
        ArrayList<CinemaDTO> cinemas = new ArrayList<>();
        try {
            Connection conn = getConnection();

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM cinema");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                CinemaDTO cinema = new CinemaDTO(rs.getInt("cinemaid"), rs.getInt("screenid1"), rs.getInt("screenid2"), rs.getString("name"), rs.getString("address"), rs.getString("postcode"), rs.getString("cityortown"), rs.getString("telephone"), rs.getString("email"));
                cinemas.add(cinema);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException sqle) {
        }
        return cinemas;
    }

    public boolean updateCinema(int cinemaID, CinemaDTO cinemaDTO) {
        boolean updateOK = false;
        try {
            Connection conn = getConnection();

            PreparedStatement stmt = conn.prepareStatement("UPDATE  cinema SET name = ?, address = ?, postcode = ?, cityortown = ?, telephone = ?, email = ? WHERE cinemaid = ?");

            stmt.setString(1, cinemaDTO.getName());
            stmt.setString(2, cinemaDTO.getAddress());
            stmt.setString(3, cinemaDTO.getPostcode());
            stmt.setString(4, cinemaDTO.getCityOrTown());
            stmt.setString(5, cinemaDTO.getTelephone());
            stmt.setString(6, cinemaDTO.getEmail());
            stmt.setInt(7, cinemaID);
            
            stmt.executeUpdate();

            updateOK = true;

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return updateOK;
    }

}
