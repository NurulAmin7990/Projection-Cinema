
package managedBean;

import customerUI.CustomerCommandFactory;
import dto.FilmDTO;
import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "viewFilm")
@RequestScoped
public class ViewFilm {

    //Method
    public ArrayList<FilmDTO> viewFilm() {
                ArrayList<FilmDTO> films = (ArrayList<FilmDTO>) CustomerCommandFactory.createCommand(CustomerCommandFactory.VIEW_FILM).execute();
                return films;
    }
    
}
