package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    String dbURL = "jdbc:mysql//localhost:3306/demoforstudy";
    String userName = "root";
    String password = "123123";

    {
        try {
            Connection connection = DriverManager.getConnection(dbURL, userName, password);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("ket noi thanh cong");
    }
}
