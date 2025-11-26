package com.user;

public class User {
    String email;
    private final String password;
    int id;

    public User(String email, String password, int id) {
        this.email = email;
        this.password = password;
        this.id = id;}

    public String getEmail() { return email; }

    public String getPassword() {return password; }

    public int getId() { return id; }

    @Override
    public String toString() {
        return "User{" +
                "email='" + getEmail() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", id=" + getId() +
                '}';
    }
}
