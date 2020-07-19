package AdminUI;

import dto.FilmDTO;
import manager.FilmManager;

public class AddFilmCommand implements AdminCommand{
    
    //Attributes
    private final FilmDTO filmDTO;
    private final FilmManager filmManager;
    
    //Methods
    public AddFilmCommand(FilmDTO filmDTO){
        this.filmDTO = filmDTO;
        filmManager = new FilmManager();
    }
    
    @Override
    public Object execute(){
        return filmManager.addFilm(filmDTO);
    }
    
}
