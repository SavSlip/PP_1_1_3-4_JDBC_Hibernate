package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
//        userDaoJDBC.createUsersTable();
//        userDaoJDBC.dropUsersTable();
//        userDaoJDBC.saveUser("Alex2", "Alll", (byte) 2);
//        userDaoJDBC.saveUser("Alex3", "Alll", (byte) 3);
//        userDaoJDBC.saveUser("Alex4", "Alll", (byte) 4);
//        userDaoJDBC.removeUserById(4);
//        userDaoJDBC.getAllUsers().forEach(System.out::println);
        userDaoJDBC.cleanUsersTable();

    }
}
