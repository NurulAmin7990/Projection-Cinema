package gateway;

import dto.CustomerDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.registry.infomodel.User;
import manager.DatabaseManager;

public class CustomerGateway extends DatabaseManager {

    boolean credentialsOK = false;
    int currentCustomer;

    public boolean registerCustomer(CustomerDTO customerDTO) {
        boolean insertOK = false;
        try {

            Connection conn = getConnection();

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Customer (firstname, lastname, dateofbirth, email, contactnumber, password) values (?, ?, ?, ?, ?, ?)");

            stmt.setString(1, customerDTO.getFirstName());
            stmt.setString(2, customerDTO.getLastName());
            stmt.setDate(3, customerDTO.getDateOfBirth());
            stmt.setString(4, customerDTO.getEmail());
            stmt.setString(5, customerDTO.getContactNumber());
            stmt.setString(6, customerDTO.getPassword());

            int rows = stmt.executeUpdate();

            insertOK = rows == 1;

            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return insertOK;
    }

   
}
