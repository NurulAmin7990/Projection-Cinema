package customerUI;

import manager.CinemaManager;

public class ViewCinemaCommand implements CustomerCommand{
    
    //Attributes
    private  final CinemaManager cinemaManager;
    
    //Methods
    public ViewCinemaCommand(){
        cinemaManager = new CinemaManager();
    }
    
    @Override
    public Object execute(){
        return cinemaManager.viewCinema();
    }
    
}
