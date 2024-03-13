package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    private final Connection connection = Util.getConnection();
    PreparedStatement preparedStatement = null;

    public UserDaoJDBCImpl() {
    }

    public void createUsersTable() {
        String SQL = "CREATE TABLE if not exists users (`id` INT NOT NULL, `name` VARCHAR(255) NOT NULL," +
                " `last_name` VARCHAR(255) NOT NULL, `age` INT NOT NULL, PRIMARY KEY (`id`))";

        try {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.executeUpdate();
            System.out.println("Table has been added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (!connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.getStackTrace();
            }
        }
    }

    public void dropUsersTable() {
        String SQL = "DROP TABLE if exists usertest";

        try {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.executeUpdate();
            System.out.println("Table has been drop");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (!connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.getStackTrace();
            }
        }

    }

    public void saveUser(String name, String lastName, byte age) {

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
