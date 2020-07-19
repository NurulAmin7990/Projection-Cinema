package AdminUI;

import dto.FilmDTO;
import manager.FilmManager;

public class UpdateFilmCommand implements AdminCommand{
    
    //Attribute
    private int filmID;
    private FilmDTO filmDTO;
    private final FilmManager filmManager; 
    
    //Methods
    public UpdateFilmCommand(int filmID, FilmDTO filmDTO){
        this.filmID = filmID;
        this.filmDTO = filmDTO;
        filmManager = new FilmManager();
    }
    
    @Override
    public Object execute(){
        return filmManager.updateFilm(filmID, filmDTO);
    }
}
