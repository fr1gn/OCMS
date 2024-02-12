package org.online.com;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class User {

    private int userId;
    private String firstName;
    private String LastName;
    private String email;
    private String password;
    private String role;


}
