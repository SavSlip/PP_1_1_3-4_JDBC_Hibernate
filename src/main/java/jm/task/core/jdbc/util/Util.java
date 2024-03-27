package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String LOGIN = "root1";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver(); // для старых версий Java
            DriverManager.registerDriver(driver);           // для старых версий Java
            Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            connection.setAutoCommit(false);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
