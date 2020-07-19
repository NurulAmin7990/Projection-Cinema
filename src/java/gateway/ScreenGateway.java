package gateway;

import dto.ScreenDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import manager.DatabaseManager;

public class ScreenGateway extends DatabaseManager {

    public ArrayList<ScreenDTO> viewScreen() {
        ArrayList<ScreenDTO> screens = new ArrayList<>();
        try {
            Connection conn = getConnection();

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM screen");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ScreenDTO screen = new ScreenDTO(rs.getInt("screenid"), rs.getInt("screennumber"), rs.getInt("filmid1"), rs.getInt("filmid2"), rs.getInt("filmid3"), rs.getTime("film1start"), rs.getTime("film2start"), rs.getTime("film3start"));
                screens.add(screen);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException sqle) {
        }
        return screens;
    }

    public boolean updateScreen(int screenID, ScreenDTO screenDTO) {
        boolean updateOK = false;
        try {
            Connection conn = getConnection();

            PreparedStatement stmt = conn.prepareStatement("UPDATE  screen SET screennumber = ?, filmid1 = ?, filmid2 = ?, filmid3 = ?, film1start = ?, film2start = ?, film3start = ? WHERE screenid = ?");

            stmt.setInt(1, screenDTO.getScreenNumber());
            stmt.setInt(2, screenDTO.getFilmID1());
            stmt.setInt(3, screenDTO.getFilmID2());
            stmt.setInt(4, screenDTO.getFilmID3());
            stmt.setTime(5, screenDTO.getFilm1Start());
            stmt.setTime(6, screenDTO.getFilm2Start());
            stmt.setTime(7, screenDTO.getFilm3Start());
            stmt.setInt(8, screenID);

            stmt.executeUpdate();

            updateOK = true;

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return updateOK;
    }

    public boolean clearScreen(int screenID) {
        boolean clearOK = false;
        try {
            Connection conn = getConnection();

            PreparedStatement stmt = conn.prepareStatement("UPDATE screen SET filmid1 = ?, filmid2 = ?, filmid3 = ?, film1start = ?, film2start = ?, film3start = ? WHERE screenid = ?");

            stmt.setNull(1, Types.INTEGER);
            stmt.setNull(2, Types.INTEGER);
            stmt.setNull(3, Types.INTEGER);
            stmt.setNull(4, Types.TIME);
            stmt.setNull(5, Types.TIME);
            stmt.setNull(6, Types.TIME);
            stmt.setInt(7, screenID);
            
            stmt.executeUpdate();

            clearOK = true;

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clearOK;
    }

}
