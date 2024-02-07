package org.online.com;

public class User {
    private int Userid;
    private static int id_gen;
    private String name;
    private String surname;

    User() {
        Userid = id_gen++;
    }

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
        this();
        setName(name);
        setSurname(surname);
    }
}
