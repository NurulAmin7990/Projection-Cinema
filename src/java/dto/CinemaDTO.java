package dto;

public class CinemaDTO {

    //Attributes
    private int cinemaID;
    private int screenID1;
    private int screenID2;
    private String name;
    private String address;
    private String postcode;
    private String cityOrTown;
    private String telephone;
    private String email;

    //Constructor
    public CinemaDTO(int cinemaID, int screenID1, int screenID2, String name, String address, String postcode, String cityOrTown, String telephone, String email) {
        this.cinemaID = cinemaID;
        this.screenID1 = screenID1;
        this.screenID2 = screenID2;
        this.name = name;
        this.address = address;
        this.postcode = postcode;
        this.cityOrTown = cityOrTown;
        this.telephone = telephone;
        this.email = email;
    }

    public CinemaDTO(String name, String address, String postcode, String cityOrTown, String telephone, String email) {
        this.name = name;
        this.address = address;
        this.postcode = postcode;
        this.cityOrTown = cityOrTown;
        this.telephone = telephone;
        this.email = email;
    }

    //Getter and setter
    public int getCinemaID() {
        return cinemaID;
    }

    public int getScreenID1() {
        return screenID1;
    }

    public int getScreenID2() {
        return screenID2;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCityOrTown() {
        return cityOrTown;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScreenID1(int screenID1) {
        this.screenID1 = screenID1;
    }

    public void setScreenID2(int screenID2) {
        this.screenID2 = screenID2;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setCityOrTown(String cityOrTown) {
        this.cityOrTown = cityOrTown;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //To string
    @Override
    public String toString() {
        return "CinemaDTO{" + "cinemaID=" + cinemaID + ", screenID1=" + screenID1 + ", screenID2=" + screenID2 + ", name=" + name + ", address=" + address + ", postcode=" + postcode + ", cityOrTown=" + cityOrTown + ", telephone=" + telephone + ", email=" + email + '}';
    }

}
