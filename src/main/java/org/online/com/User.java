package org.online.com;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter

public class User {

    private int userId;
    private String FirstName;
    private String LastName;
    private String email;
    private String password;
    private String role;
    public User(String firstName, String lastName, String email, String password, String role) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPassword(password);
        setRole(role);
    }

    public User(int UserId, String firstName, String lastName, String email, String password, String role) {
        this(firstName, lastName, email, password, role);
        setUserId(UserId);
    }
    public User() {

    }

    @Override
    public String toString() {
        return userId + "Name" + FirstName + "Surname" + LastName + "email" + email + "Role" + role;
    }
}