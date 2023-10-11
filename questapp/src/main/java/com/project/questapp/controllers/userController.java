package com.project.questapp.controllers;

import com.project.questapp.entities.user;
import com.project.questapp.repos.userRepository;
import com.project.questapp.services.userService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class userController {

    private userService userService;

    public userController(userService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<user> getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping
    public user createUser(@RequestBody user newUser){
        return userService.saveOneUser(newUser);
    }

    @GetMapping("/{userId}")
    public user getOneUser(@PathVariable Long userId){
        //custom exception
        return userService.getOneUser(userId);
    }
    @PutMapping("/{userId}")
    public user updateOneUser(@PathVariable Long userId, @RequestBody user newUser){
        return userService.updateOneUser(userId,newUser);
    }
    @DeleteMapping("/{userId}")
    public  void deleteUser(@PathVariable Long userId){
        userService.deleteById(userId);
    }
}
