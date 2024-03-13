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
        Connection connection;
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver(); // для старых версий Java
            DriverManager.registerDriver(driver);           // для старых версий Java
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            connection.setAutoCommit(false);
//            if (!connection.isClosed()) {
//                System.out.println("Connection OK");
//            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
