package org.online.controllers;

import org.online.com.User;
import org.online.repesitories.interfaces.IUserRepository;

import java.util.List;

public class UserController {
    private final IUserRepository repo;

    public UserController(IUserRepository repo) {
        this.repo = repo;
    }

    public String createUser(String firstName, String LastName, String email, String password, String role) {

        User user = new User(firstName, LastName, email, password, role);

        boolean created = repo.createUser(user);

        return (created ? "User was created!" : "User creation was failed!");
    }

    public String getUser(int userId) {
        User user = repo.getUser(userId);

        return (user == null ? "User was not found!" : user.toString());
    }

    public String getAllUsers() {
        List<User> users = repo.getAllUsers();

        StringBuilder response = new StringBuilder();
        for (User user : users) {
            response.append(user.toString()).append("\n");
        }

        return response.toString();
    }
}