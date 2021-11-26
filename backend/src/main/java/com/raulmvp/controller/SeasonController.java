package com.raulmvp.controller;

import com.raulmvp.dao.SeasonDao;
import com.raulmvp.entity.SeasonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/season")
public class SeasonController {

    @Autowired
    private SeasonDao seasonDao;

    @GetMapping("/get-by-id")
    public ResponseEntity<SeasonEntity> getSeasonById(int id) {
        SeasonEntity seasonEntity = seasonDao.findSeasonById(id);
        return new ResponseEntity<SeasonEntity>(seasonEntity, HttpStatus.OK);
    }
}
