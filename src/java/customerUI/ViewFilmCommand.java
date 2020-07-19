package customerUI;

import manager.FilmManager;

public class ViewFilmCommand implements CustomerCommand {

    //Attributes
    private final FilmManager filmManager;

    //Methods
    public ViewFilmCommand() {
        filmManager = new FilmManager();
    }

    @Override
    public Object execute() {
        return filmManager.viewFilm();
    }

}
