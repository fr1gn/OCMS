package org.online.com;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
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
    }

}





