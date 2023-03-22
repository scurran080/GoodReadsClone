package com.betterreads.user;

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
    public User createUser(User user){
        return null;
    }

    @GetMapping(path = "/get/{id}")
    public User getById(@PathVariable Long id){
        return null;
    }
}
