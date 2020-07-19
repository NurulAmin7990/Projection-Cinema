package AdminUI;

import dto.CinemaDTO;
import dto.FilmDTO;
import dto.ScreenDTO;

public class AdminCommandFactory {

    //Attributes
    public static final int UPDATE_CINEMA = 1;
    public static final int UPDATE_SCREEN = 2;
    public static final int CLEAR_SCREEN = 3;
    public static final int ADD_FILM = 4;
    public static final int UPDATE_FILM = 5;
    public static final int DELETE_FILM = 6;
    public static final int VIEW_CINEMA = 7;
    public static final int VIEW_SCREEN = 8;
    public static final int VIEW_FILM = 9;

    //Methods
    public static AdminCommand createCommand(int commandType, int cinemaID, CinemaDTO cinemaDTO) {
        switch (commandType) {
            case UPDATE_CINEMA:
                return new UpdateCinemaCommand(cinemaID, cinemaDTO);
            default:
                return null;
        }
    }

    public static AdminCommand createCommand(int commandType, int screenID, ScreenDTO screenDTO) {
        switch (commandType) {
            case UPDATE_SCREEN:
                return new UpdateScreenCommand(screenID, screenDTO);
            default:
                return null;
        }
    }

    public static AdminCommand createCommand(int commandType, FilmDTO filmDTO) {
        switch (commandType) {
            case ADD_FILM:
                return new AddFilmCommand(filmDTO);
            default:
                return null;
        }
    }

    public static AdminCommand createCommand(int commandType, int filmID, FilmDTO filmDTO) {
        switch (commandType) {
            case UPDATE_FILM:
                return new UpdateFilmCommand(filmID, filmDTO);
            default:
                return null;
        }
    }

    public static AdminCommand createCommand(int commandType, int ID) {
        switch (commandType) {
            case CLEAR_SCREEN:
                return new ClearScreenCommand(ID);
            case DELETE_FILM:
                return new DeleteFilmCommand(ID);
            default:
                return null;
        }
    }

    public static AdminCommand createCommand(int commandType) {
        switch (commandType) {
            case VIEW_CINEMA:
                return new ViewCinemaCommand();
            case VIEW_SCREEN:
                return new ViewScreenCommand();
            case VIEW_FILM:
                return new ViewFilmCommand();
            default:
                return null;
        }
    }
}
