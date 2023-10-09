package com.geekster.resturant.management.api.service;

import com.geekster.resturant.management.api.model.User;
import com.geekster.resturant.management.api.repo.IUserrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class Userservice {
    @Autowired
  private  IUserrepo iUserrepo;
    public void signUp(User user) {
        // Implement user registration logic, including role assignment
       iUserrepo.save(user);
    }


    public User signIn(String username, String password) {
        // Implement user sign-in logic
        // You may use Spring Security for authentication
        return iUserrepo.findByUsername(username);
    }

    public List<User> getAllUsers() {
        return iUserrepo.findAll();
    }
}
