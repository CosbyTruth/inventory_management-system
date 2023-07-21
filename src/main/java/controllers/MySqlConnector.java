package controllers;
import java.sql.*;

public class MySqlConnector {

    public static  Connection getConnection()  throws SQLException {
        String url = "jdbc:mysql://localhost:3306/struct";
        String username ="russell";
        String password ="12345";

        Connection connection = DriverManager.getConnection(url, username, password);

        return  connection;
    }
}
