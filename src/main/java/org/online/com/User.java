package org.online.com;

public class User {
    private int Userid;
    private String name;
    private String surname;

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
    public User(String name, String surname) {
        setName(name);
        setSurname(surname);
    }
}
