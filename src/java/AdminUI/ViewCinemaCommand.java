package AdminUI;

import manager.CinemaManager;

public class ViewCinemaCommand implements AdminCommand{
    
    //Attributes
    private final CinemaManager cinemaManager;
    
    //Methods
    public ViewCinemaCommand(){
        cinemaManager = new CinemaManager();
    }
    
    @Override
    public Object execute(){
        return cinemaManager.viewCinema();
    }
    
}
