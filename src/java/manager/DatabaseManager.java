package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

    protected Connection getConnection() {
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
            return DriverManager.getConnection("jdbc:derby://localhost:1527/cinema", "amin", "amin");
        } catch (SQLException e) {
            return null;
        }
    }
}
