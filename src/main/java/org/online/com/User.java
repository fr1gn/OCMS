package org.online.com;

public class User {
    private int userId;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String role;


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    User() {

    }
    public User(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }
}
