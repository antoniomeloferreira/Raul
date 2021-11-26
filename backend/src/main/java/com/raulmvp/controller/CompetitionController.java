package com.raulmvp.controller;

import com.raulmvp.model.Competition;
import com.raulmvp.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/competition")
public class CompetitionController {

    @Autowired
    private CompetitionService competitionService;

    @GetMapping("/create-competition")
    public ResponseEntity<Competition> createCompetition() {

       Competition competition = competitionService.createCompetition();
       return new ResponseEntity<Competition>(competition, HttpStatus.OK);
    }

}
