package jm.task.core.jdbc.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static Configuration getConfiguration() {
        return new Configuration()
                .setProperty("hibernate.driver_class", "com.mysql.cj.jdbc.Driver()")
                .setProperty("hibernate.connection.url", URL)
                .setProperty("hibernate.connection.username", LOGIN)
                .setProperty("hibernate.connection.password", PASSWORD)
                .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect")
                .setProperty("hibernate.show_sql", "true")
                .setProperty("hibernate.current_session_context_class", "thread");
    }
}
