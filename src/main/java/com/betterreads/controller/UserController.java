package com.betterreads.controller;

import com.betterreads.models.User;
import com.betterreads.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping(path = "/create")
    public void createUser(User user){
        this.userService.createUser(user);
    }

    @GetMapping(path = "/get/{id}")
    public User getById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @GetMapping(path = "/get/user/{username}")
    public User getUserByUsername(@PathVariable String username){
        return userService.getUserByUsername(username);
    }
}
