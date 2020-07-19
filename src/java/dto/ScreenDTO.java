package dto;

import java.sql.Time;

public class ScreenDTO {

    //Attributes
    private int screenID;
    private int screenNumber;
    private int filmID1;
    private int filmID2;
    private int filmID3;
    private Time film1Start;
    private Time film2Start;
    private Time film3Start;

    //Constructor
    public ScreenDTO(int screenID, int screenNumber, int filmID1, int filmID2, int filmID3, Time film1Start, Time film2Start, Time film3Start) {
        this.screenID = screenID;
        this.screenNumber = screenNumber;
        this.filmID1 = filmID1;
        this.filmID2 = filmID2;
        this.filmID3 = filmID3;
        this.film1Start = film1Start;
        this.film2Start = film2Start;
        this.film3Start = film3Start;
    }

    public ScreenDTO(int screenNumber, int filmID1, int filmID2, int filmID3, Time film1Start, Time film2Start, Time film3Start) {
        this.screenNumber = screenNumber;
        this.filmID1 = filmID1;
        this.filmID2 = filmID2;
        this.filmID3 = filmID3;
        this.film1Start = film1Start;
        this.film2Start = film2Start;
        this.film3Start = film3Start;
    }

    //Getter and setter
    public int getScreenID() {
        return screenID;
    }

    public int getScreenNumber() {
        return screenNumber;
    }

    public int getFilmID1() {
        return filmID1;
    }

    public int getFilmID2() {
        return filmID2;
    }

    public int getFilmID3() {
        return filmID3;
    }

    public Time getFilm1Start() {
        return film1Start;
    }

    public Time getFilm2Start() {
        return film2Start;
    }

    public Time getFilm3Start() {
        return film3Start;
    }

    public void setScreenNumber(int screenNumber) {
        this.screenNumber = screenNumber;
    }

    public void setFilmID1(int filmID1) {
        this.filmID1 = filmID1;
    }

    public void setFilmID2(int filmID2) {
        this.filmID2 = filmID2;
    }

    public void setFilmID3(int filmID3) {
        this.filmID3 = filmID3;
    }

    public void setFilm1Start(Time film1Start) {
        this.film1Start = film1Start;
    }

    public void setFilm2Start(Time film2Start) {
        this.film2Start = film2Start;
    }

    public void setFilm3Start(Time film3Start) {
        this.film3Start = film3Start;
    }

    //To string
    @Override
    public String toString() {
        return "ScreenDTO{" + "screenID=" + screenID + ", screenNumber=" + screenNumber + ", filmID1=" + filmID1 + ", filmID2=" + filmID2 + ", filmID3=" + filmID3 + ", film1Start=" + film1Start + ", film2Start=" + film2Start + ", film3Start=" + film3Start + '}';
    }

}
