package com.spring.chsjr1996.template.controllers;

import com.spring.chsjr1996.template.models.User;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    
    @GetMapping("/users")
    public List<User> index() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Carlos", "carlos@template.com", "admin123", true));
        users.add(new User(2, "Solrac", "solrac@template.com", "admin123", true));
        users.add(new User(3, "Henrique", "henrique@template.com", "admin123", true));
        return users;
    }
}