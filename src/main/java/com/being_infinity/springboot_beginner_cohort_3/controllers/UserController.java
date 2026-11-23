package com.being_infinity.springboot_beginner_cohort_3.controllers;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.being_infinity.springboot_beginner_cohort_3.models.User;
import com.being_infinity.springboot_beginner_cohort_3.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }

    @GetMapping
    public List<User> getAllusers(){
        return userService.getAllUsers();
    }

    @GetMapping("/random")
    public ResponseEntity<User> myRandomUser(){
        User temp = userService.myRandomUser();
        if (temp != null) {
            return ResponseEntity.ok(temp);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @PostMapping
    public User addUser(@RequestBody User newUser){
        return userService.addUser(newUser);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User updatedUser){
        return userService.updateUser(id, updatedUser);
    }

    @DeleteMapping("/{id}")
    public boolean deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }
}
