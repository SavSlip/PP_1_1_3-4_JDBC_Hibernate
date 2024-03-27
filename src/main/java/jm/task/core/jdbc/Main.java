package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("User1", "Userovish", (byte) 18);
        userService.saveUser("User2", "Userovish", (byte) 25);
        userService.saveUser("User3", "Userovish", (byte) 45);
        userService.saveUser("User4", "Userovish", (byte) 55);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
