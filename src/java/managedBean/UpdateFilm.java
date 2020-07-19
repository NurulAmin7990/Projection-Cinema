package managedBean;

import AdminUI.AdminCommandFactory;
import dto.FilmDTO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Named(value = "updateFilm")
@SessionScoped
public class UpdateFilm implements Serializable {

    //Attributes
    private int filmID;
    private String name;
    private String rating;
    private String releaseDate;
    private String duration;
    private String genre;
    private String description;
    private FilmDTO filmDTO;

    //Getter and setter method
    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void updateFilm() {
        Date releaseDateSQL = Date.valueOf(releaseDate);
        Time durationSQL = Time.valueOf(duration);
        filmDTO = new FilmDTO(name, rating, releaseDateSQL, durationSQL, genre, description);
        AdminCommandFactory.createCommand(AdminCommandFactory.UPDATE_FILM, filmID, filmDTO).execute();
    }

}
