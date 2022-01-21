package com.raulmvp.controller;

import com.raulmvp.dao.SeasonDao;
import com.raulmvp.entity.SeasonEntity;
import com.raulmvp.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/season")
public class SeasonController {

    @Autowired
    private SeasonService seasonService;

    @GetMapping("/by-id")
    public ResponseEntity<SeasonEntity> getSeasonById(@RequestBody Integer aId) {
        SeasonEntity seasonEntity = seasonService.getSeasonById(aId);
        return new ResponseEntity<>(seasonEntity, HttpStatus.OK);
    }
}
