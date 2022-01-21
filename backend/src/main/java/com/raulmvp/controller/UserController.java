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

    @GetMapping("/by-username")
    public ResponseEntity<UserEntity> getUserByUserName(@RequestBody String aUsername) {

        UserEntity userEntity = userService.getUserByUsername(aUsername);
        return new ResponseEntity<>(userEntity, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<UserEntity> createUser(@RequestBody RaulUserRegisterData aRegisterData) {

        UserEntity raulUserEntity = userService.createUser(aRegisterData);
        return raulUserEntity != null ? new ResponseEntity<>(raulUserEntity, HttpStatus.OK) : new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Boolean> deleteUser(@RequestBody String aUsername) {
        Boolean isDeleted = userService.deleteUser(aUsername);
        return new ResponseEntity<>(isDeleted, HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<RaulUserDto> login(@RequestBody RaulUserLoginData aLoginData) {

        RaulUserDto raulUserDto = userService.login(aLoginData);
        return raulUserDto != null ? new ResponseEntity<>(raulUserDto, HttpStatus.OK) : new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }
}
