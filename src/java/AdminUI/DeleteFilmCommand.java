package AdminUI;

import manager.FilmManager;

public class DeleteFilmCommand implements AdminCommand{
    
    //Attribute
    private int filmID;
    private FilmManager filmManager; 
    
    //Methods
    public DeleteFilmCommand(int filmID){
        this.filmID = filmID;
        filmManager = new FilmManager();
    }
    
    @Override
    public Object execute(){
        return filmManager.deleteFilm(filmID);
    }
}
