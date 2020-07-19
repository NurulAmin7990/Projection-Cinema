package managedBean;

import AdminUI.AdminCommandFactory;
import dto.CinemaDTO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "updateCinema")
@SessionScoped
public class UpdateCinema implements Serializable {
    //Attributes
    private CinemaDTO cinemaDTO;
    private int cinemaID;
    private String name;
    private String address;
    private String postcode;
    private String cityOrTown;
    private String telephone;
    private String email;
    
    //Getter and setter

    public int getCinemaID() {
        return cinemaID;
    }

    public void setCinemaID(int cinemaID) {
        this.cinemaID = cinemaID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCityOrTown() {
        return cityOrTown;
    }

    public void setCityOrTown(String cityOrTown) {
        this.cityOrTown = cityOrTown;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //Methods

    public void updateCinema() {
        cinemaDTO = new CinemaDTO(name, address, postcode, cityOrTown, telephone, email);
        AdminCommandFactory.createCommand(AdminCommandFactory.UPDATE_CINEMA, cinemaID, cinemaDTO).execute();
    }
    
}
