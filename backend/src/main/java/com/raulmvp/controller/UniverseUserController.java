package com.raulmvp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.raulmvp.entity.UniverseUserEntity;
import com.raulmvp.service.UniverseUserService;

@RestController
@RequestMapping("/universe-user")
public class UniverseUserController {

    @Autowired
    UniverseUserService universeUserService;

    @GetMapping("/user")
    public ResponseEntity<List<UniverseUserEntity>> getUniverseUser(@RequestBody UniverseUserEntity aUniverseUser) {
        List universeUserList = universeUserService.getUniverseUser(aUniverseUser);
        return new ResponseEntity<>(universeUserList, HttpStatus.OK);
    }
}
