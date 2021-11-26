package com.raulmvp.controller;

import com.raulmvp.entity.UserEntity;
import com.raulmvp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get-user")
    public UserEntity getUserByUserName(String userName) {

        return userService.getUserByName(userName);
    }

    @PostMapping("/create-user")
    public ResponseEntity<String> createUser(@RequestBody UserEntity user) {

        userService.createUser(user);
        return new ResponseEntity<String>("User", HttpStatus.OK);
    }
}
