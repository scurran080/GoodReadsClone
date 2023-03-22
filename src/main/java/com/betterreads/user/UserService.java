package com.betterreads.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void createUser(User user){
        userRepository.save(user);
    }

    public User getUserById(Long id){
        return userRepository.getUserById(id);
    }

    public User getUserByUsername(String username){
        return userRepository.getUserByUsername(username);
    }
}
