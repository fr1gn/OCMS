package org.online.com;

import lombok.Getter;
import lombok.Setter;

public class User {
    @Setter
    @Getter
    private int userId;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String role;

    User() {
    }

}
