package managedBean;

import customerUI.CustomerCommandFactory;
import dto.CustomerDTO;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.sql.Date;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.servlet.Registration;

@Named(value = "registerCustomer")
@RequestScoped
public class RegisterCustomer  implements Serializable{

    //Attributes
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private String contactNumber;
    private String password;
    private CustomerDTO customerDTO;

    //Getter and setter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        try {
            byte[] hash
                    = MessageDigest.getInstance("SHA-256")
                            .digest(password.getBytes(StandardCharsets.UTF_8));

            password = Base64.getEncoder().encodeToString(hash);
        } catch (Exception e) {
            this.password = "";
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, e.toString());
        }
        this.password = password;
    }

    //Method
    public void registerCustomer() {
        Date dateOfBirthSQL = Date.valueOf(dateOfBirth);
        customerDTO = new CustomerDTO(firstName, lastName, dateOfBirthSQL, email, contactNumber, password);
        CustomerCommandFactory.createCommand(CustomerCommandFactory.REGISTER_CUSTOMER, customerDTO).execute();
    }

    //Validator
}
