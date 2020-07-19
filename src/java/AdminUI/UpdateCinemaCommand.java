package AdminUI;

import dto.CinemaDTO;
import manager.CinemaManager;

public class UpdateCinemaCommand implements AdminCommand{
    
    //Attributes
    private int cinemaID;
    private CinemaDTO cinemaDTO;
    private final CinemaManager cinemaManager;
    
    //Method
    public UpdateCinemaCommand(int cinemaID, CinemaDTO cinemaDTO){
        this.cinemaID = cinemaID;
        this.cinemaDTO = cinemaDTO;
        cinemaManager = new CinemaManager();
    }
    
    @Override
    public Object execute(){
        return cinemaManager.updateCinema(cinemaID, cinemaDTO);
    }
}
