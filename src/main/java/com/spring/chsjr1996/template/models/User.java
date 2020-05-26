package com.spring.chsjr1996.template.models;

public class User {
    
    public long id;
    public String name;
    public String email;
    public String password;
    public boolean isActive;

    public User(
        long id,
        String name,
        String email,
        String password,
        boolean isActive
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.isActive = isActive;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return name;
    }

    public boolean getIsActive() {
        return isActive;
    }
}