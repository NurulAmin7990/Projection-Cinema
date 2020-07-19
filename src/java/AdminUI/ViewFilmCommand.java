package AdminUI;

import manager.FilmManager;

public class ViewFilmCommand implements AdminCommand{
    
    //Attributes
    private final FilmManager filmManager;
    
    //Methods
    public ViewFilmCommand(){
        filmManager = new FilmManager();
    }
    
    @Override
    public Object execute(){
        return filmManager.viewFilm();
    }
    
}
