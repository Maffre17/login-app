package com.exemplo.login.model;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isValid() {
        return username.equals("admin") && password.equals("1234");
    }
}