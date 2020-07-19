package managedBean;

import AdminUI.AdminCommandFactory;
import dto.ScreenDTO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Time;

@Named(value = "updateScreen")
@SessionScoped
public class UpdateScreen implements Serializable {

    //Attributes
    private ScreenDTO screenDTO;
    private int screenID;
    private int screenNumber;
    private int filmID1;
    private int filmID2;
    private int filmID3;
    private String film1Start;
    private String film2Start;
    private String film3Start;

    //Getter and setter method
    public int getScreenID() {
        return screenID;
    }

    public void setScreenID(int screenID) {
        this.screenID = screenID;
    }

    public int getScreenNumber() {
        return screenNumber;
    }

    public void setScreenNumber(int screenNumber) {
        this.screenNumber = screenNumber;
    }

    public int getFilmID1() {
        return filmID1;
    }

    public void setFilmID1(int filmID1) {
        this.filmID1 = filmID1;
    }

    public int getFilmID2() {
        return filmID2;
    }

    public void setFilmID2(int filmID2) {
        this.filmID2 = filmID2;
    }

    public int getFilmID3() {
        return filmID3;
    }

    public void setFilmID3(int filmID3) {
        this.filmID3 = filmID3;
    }

    public String getFilm1Start() {
        return film1Start;
    }

    public void setFilm1Start(String film1Start) {
        this.film1Start = film1Start;
    }

    public String getFilm2Start() {
        return film2Start;
    }

    public void setFilm2Start(String film2Start) {
        this.film2Start = film2Start;
    }

    public String getFilm3Start() {
        return film3Start;
    }

    public void setFilm3Start(String film3Start) {
        this.film3Start = film3Start;
    }

    //Method
    public void updateScreen() {
        Time film1StartSQL = Time.valueOf(film1Start);
        Time film2StartSQL = Time.valueOf(film2Start);
        Time film3StartSQL = Time.valueOf(film3Start);
        screenDTO = new ScreenDTO(screenNumber, filmID1, filmID2, filmID3, film1StartSQL, film2StartSQL, film3StartSQL);
         AdminCommandFactory.createCommand(AdminCommandFactory.UPDATE_SCREEN, screenID, screenDTO).execute();
    }

}
