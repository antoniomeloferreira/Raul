package com.raulmvp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.raulmvp.entity.UserEntity;
import com.raulmvp.model.dto.RaulUserDto;
import com.raulmvp.model.dto.RaulUserLoginData;
import com.raulmvp.model.dto.RaulUserRegisterData;
import com.raulmvp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get-user")
    public ResponseEntity<UserEntity> getUserByUserName(@RequestBody String username) {

        UserEntity userEntity = userService.getUserByUsername(username);
        return new ResponseEntity<>(userEntity, HttpStatus.OK);
    }

    @PostMapping("/create-user")
    public ResponseEntity<UserEntity> createUser(@RequestBody RaulUserRegisterData user) {

        UserEntity raulUser = userService.createUser(user);
        return raulUser != null ? new ResponseEntity<>(raulUser, HttpStatus.OK) : new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/delete-user")
    public ResponseEntity<String> deleteUser(@RequestBody String username) {
        userService.deleteUser(username);
        return new ResponseEntity<>("User deleted", HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<RaulUserDto> login(@RequestBody RaulUserLoginData loginData) {

        System.out.println(loginData.getPassword());
        System.out.println(loginData.getUsername());

        RaulUserDto raulUserDto = userService.login(loginData);
        return raulUserDto != null ? new ResponseEntity<>(raulUserDto, HttpStatus.OK) : new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }
}
