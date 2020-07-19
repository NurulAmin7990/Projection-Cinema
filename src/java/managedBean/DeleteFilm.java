package managedBean;

import AdminUI.AdminCommandFactory;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "deleteFilm")
@SessionScoped
public class DeleteFilm implements Serializable {

    //Attributes
    private int filmID;
    
    //Getter and setter methods

    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }
    
    public void deleteFilm() {
        AdminCommandFactory.createCommand(AdminCommandFactory.DELETE_FILM, filmID).execute();
    }
    
}
