package dto;

import java.sql.Time;
import java.sql.Date;

public class FilmDTO {

    //Attributes
    private int filmID;
    private String name;
    private String rating;
    private Date releaseDate;
    private Time duration;
    private String genre;
    private String description;

    //Constructor
    public FilmDTO(int filmID, String name, String rating, Date releaseDate, Time duration, String genre, String description) {
        this.filmID = filmID;
        this.name = name;
        this.rating = rating;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.genre = genre;
        this.description = description;
    }

    public FilmDTO(String name, String rating, Date releaseDate, Time duration, String genre, String description) {
        this.name = name;
        this.rating = rating;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.genre = genre;
        this.description = description;
    }

    //Getter and setter
    public int getFilmID() {
        return filmID;
    }

    public String getName() {
        return name;
    }

    public String getRating() {
        return rating;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public Time getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //To string
    @Override
    public String toString() {
        return "FilmDTO{" + "filmID=" + filmID + ", name=" + name + ", rating=" + rating + ", releaseDate=" + releaseDate + ", duration=" + duration + ", genre=" + genre + ", description=" + description + '}';
    }

}
