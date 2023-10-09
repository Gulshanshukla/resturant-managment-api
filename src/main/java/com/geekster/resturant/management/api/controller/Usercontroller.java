package com.geekster.resturant.management.api.controller;

import com.geekster.resturant.management.api.model.User;
import com.geekster.resturant.management.api.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated

public class Usercontroller {
    @Autowired
  private  Userservice userservice;
    @PostMapping("Singup")
    public String signUp(@RequestBody User user) {
        userservice.signUp(user);
        return "User registered successfully";
    }
    @PostMapping("/signin")
    public User signIn(@RequestBody User user) {
        return userservice.signIn(user.getUsername(), user.getPassword());
    }
    @GetMapping("/list")
    public List<User> getAllUsers() {
        return userservice.getAllUsers();
    }
}
