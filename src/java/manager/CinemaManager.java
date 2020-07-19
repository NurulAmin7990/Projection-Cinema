package manager;

import dto.CinemaDTO;
import gateway.CinemaGateway;
import java.util.ArrayList;

public class CinemaManager {
    
    //Attributes
    private CinemaGateway cinemaGateway = new gateway.CinemaGateway();
    
    //Methods
    public ArrayList<CinemaDTO> viewCinema(){
        return cinemaGateway.viewCinema();
    }
    
    public boolean updateCinema(int cinemaID, CinemaDTO cinemaDTO){
        return cinemaGateway.updateCinema(cinemaID, cinemaDTO);
    }
}
