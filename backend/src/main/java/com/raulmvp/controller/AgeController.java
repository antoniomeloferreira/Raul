package com.raulmvp.controller;

import com.raulmvp.dao.AgeDao;
import com.raulmvp.entity.AgeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/age")
public class AgeController {

    @Autowired
    private AgeDao ageDao;

    @GetMapping("/get-by-id")
    public ResponseEntity<AgeEntity> getAgeById(int id) {
        AgeEntity ageEntity = ageDao.getUniverseById(id);
        return new ResponseEntity<AgeEntity>(ageEntity, HttpStatus.OK);
    }
}
