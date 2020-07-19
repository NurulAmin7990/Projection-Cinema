package managedBean;

import customerUI.CustomerCommandFactory;
import dto.CinemaDTO;
import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "viewCinema")
@RequestScoped
public class ViewCinema {

    //Method
    public ArrayList<CinemaDTO> viewCinema() {
        ArrayList<CinemaDTO> cinemas = (ArrayList<CinemaDTO>) CustomerCommandFactory.createCommand(CustomerCommandFactory.VIEW_CINEMA).execute();
        return cinemas;
    }

}
