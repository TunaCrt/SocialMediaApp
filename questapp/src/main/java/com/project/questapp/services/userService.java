package com.project.questapp.services;

import com.project.questapp.entities.user;
import com.project.questapp.repos.userRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userService {

    private userRepository userRepository;

    public userService(com.project.questapp.repos.userRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<user> getAllUsers() {
        return userRepository.findAll();
    }

    public user saveOneUser(user newUser) {
        return userRepository.save(newUser);
    }

    public user getOneUser(Long userId) {
       return userRepository.findById(userId).orElse(null);
    }

    public user updateOneUser(Long userId, user newUser) {
        Optional<user> user = userRepository.findById(userId);
        if (user.isPresent()){
            user foundUser = user.get();
            foundUser.setUserName(newUser.getUserName());
            foundUser.setPassword(newUser.getPassword());
            userRepository.save(foundUser);
            return foundUser;
        }else
            return null;
    }

    public void deleteById(Long userId) {
        userRepository.deleteById(userId);
    }
}
