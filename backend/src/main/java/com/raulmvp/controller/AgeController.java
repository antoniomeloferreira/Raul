package com.raulmvp.controller;

import com.raulmvp.entity.AgeEntity;
import com.raulmvp.service.AgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/age")
public class AgeController {

    @Autowired
    private AgeService ageService;

    @GetMapping("/by-id")
    public ResponseEntity<AgeEntity> getAgeById(@RequestBody Integer id) {
        AgeEntity ageEntity = ageService.getUniverseById(id);
        return new ResponseEntity<>(ageEntity, HttpStatus.OK);
    }
}
