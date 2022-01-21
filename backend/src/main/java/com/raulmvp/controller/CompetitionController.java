package com.raulmvp.controller;

import com.raulmvp.model.Competition;
import com.raulmvp.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/competition")
public class CompetitionController {

    @Autowired
    private CompetitionService competitionService;

    @PostMapping("/create")
    public ResponseEntity<Competition> createCompetition(@RequestBody Competition aCompetition) {

       Competition competition = competitionService.createCompetition(aCompetition);
       return new ResponseEntity<>(competition, HttpStatus.OK);
    }

}
