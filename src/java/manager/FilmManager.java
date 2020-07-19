package manager;

import dto.FilmDTO;
import gateway.FilmGateway;
import java.util.ArrayList;

public class FilmManager {
    
    //Attributes
    private FilmGateway filmGateway = new FilmGateway();
    
    //Methods
    public ArrayList<FilmDTO> viewFilm(){
        return filmGateway.viewFilm();
    }
    
    public boolean addFilm(FilmDTO filmDTO){
        return filmGateway.addFilm(filmDTO);
    }
    
    public boolean updateFilm(int filmID, FilmDTO filmDTO){
        return  filmGateway.updateFilm(filmID, filmDTO);
    }
    
    public boolean deleteFilm(int filmID){
        return filmGateway.deleteFilm(filmID);
    }
    
}
