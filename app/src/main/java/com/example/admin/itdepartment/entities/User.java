package com.example.admin.itdepartment.entities;

import java.util.HashMap;

public class User {
    private String email;
    private String name;
    private boolean hasLoggedInWithPassword;


    public User() {
    }

    public User(String email, String name, boolean hasLoggedInWithPassword) {
        this.email = email;
        this.name = name;
        this.hasLoggedInWithPassword = hasLoggedInWithPassword;
    }



    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }



    public boolean isHasLoggedInWithPassword() {
        return hasLoggedInWithPassword;
    }
}
