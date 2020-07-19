package gateway;

import dto.FilmDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import manager.DatabaseManager;

public class FilmGateway extends DatabaseManager {

    public ArrayList<FilmDTO> viewFilm() {
        ArrayList<FilmDTO> films = new ArrayList<>();
        try {
            Connection conn = getConnection();

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM film");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                FilmDTO film = new FilmDTO(rs.getInt("filmid"), rs.getString("name"), rs.getString("rating"), rs.getDate("releasedate"), rs.getTime("duration"), rs.getString("genre"), rs.getString("description"));
                films.add(film);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException sqle) {
        }
        return films;
    }

    public boolean addFilm(FilmDTO filmDTO) {
        boolean insertOK = false;
        try {
            Connection conn = getConnection();

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Film(name, rating, releasedate, duration, genre, description) values (?,?,?,?,?,?)");

            stmt.setString(1, filmDTO.getName());
            stmt.setString(2, filmDTO.getRating());
            stmt.setDate(3, filmDTO.getReleaseDate());
            stmt.setTime(4, filmDTO.getDuration());
            stmt.setString(5, filmDTO.getGenre());
            stmt.setString(6, filmDTO.getDescription());

            int rows = stmt.executeUpdate();

            insertOK = rows == 1;

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return insertOK;
    }

    public boolean updateFilm(int filmID, FilmDTO filmDTO) {
        boolean updateOK = false;
        try {
            Connection conn = getConnection();

            PreparedStatement stmt = conn.prepareStatement("UPDATE  Film SET name = ?, rating = ?, releasedate = ?, duration = ?, genre = ?, description = ? WHERE filmid = ?");

            stmt.setString(1, filmDTO.getName());
            stmt.setString(2, filmDTO.getRating());
            stmt.setDate(3, filmDTO.getReleaseDate());
            stmt.setTime(4, filmDTO.getDuration());
            stmt.setString(5, filmDTO.getGenre());
            stmt.setString(6, filmDTO.getDescription());
            stmt.setInt(7, filmID);

            stmt.executeUpdate();

            updateOK = true;

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return updateOK;
    }

    public boolean deleteFilm(int filmID) {
        boolean deleteOK = false;
        try {
            Connection conn = getConnection();

            PreparedStatement stmt = conn.prepareStatement("DELETE FROM Film WHERE filmid = ?");

            stmt.setInt(1, filmID);
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
