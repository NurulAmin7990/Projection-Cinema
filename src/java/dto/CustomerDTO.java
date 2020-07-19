package dto;

import java.sql.Date;

public class CustomerDTO {
    
    //Attributes
    private int customerID;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String email;
    private String contactNumber;
    private String password;
    
    //Constructor
    public CustomerDTO(int customerID, String firstName, String lastName, Date dateOfBirth, String email, String contactNumber, String password) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.contactNumber = contactNumber;
        this.password = password;
    }
    
        public CustomerDTO(String firstName, String lastName, Date dateOfBirth, String email, String contactNumber, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.contactNumber = contactNumber;
        this.password = password;
    }
    
    //Getter and setter

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //To string
    @Override
    public String toString() {
        return "customerDTO{" + "customerID=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", contactNumber=" + contactNumber + ", password=" + password + '}';
    }
    
}
