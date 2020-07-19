package managedBean;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.Registration;
import javax.xml.registry.infomodel.User;
import manager.DatabaseManager;

@Named(value = "loginCustomer")
@SessionScoped
public class LoginCustomer extends DatabaseManager implements Serializable {

    //Attributes
    private String email;
    private String password;
    private String adminEmail;
    private String adminPassword;
    private boolean credentialsOK = false;
    private int currentCustomer;

    //Getter and setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public int getCurrentCustomer() {
        return currentCustomer;
    }

    //Methods
    public boolean loginCustomer() {
        try {
            Connection conn = getConnection();

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM customer WHERE email = ?");

            stmt.setString(1, email);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                credentialsOK = rs.getString("password").equals(password);
                if (credentialsOK = true) {
                    currentCustomer = rs.getInt("customerid");
                }
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, e.toString());
            this.email = "";
            this.password = "";
        };
        return credentialsOK;
    }

    public String loginAdmin() {
        if (adminEmail.equals("admin") && adminPassword.equals("projection")) {
            return "adminPanel";
        } else {
            this.adminEmail = "";
            this.adminPassword = "";
            return "adminLogin";
        }
    }

    public String logout() {
        this.email = "";
        this.password = "";
        this.credentialsOK = false;
        this.currentCustomer = 0;
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "login";
    }

}
