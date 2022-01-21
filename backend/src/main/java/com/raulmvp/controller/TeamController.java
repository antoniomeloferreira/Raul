package com.raulmvp.controller;

import com.raulmvp.entity.TeamEntity;
import com.raulmvp.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/get-teams")
    public ResponseEntity<List<TeamEntity>> getAllTeams() {
        List tLst = teamService.getAllTeams();
        return new ResponseEntity<>(tLst, HttpStatus.OK);
    }

    @GetMapping("/get-team-by-name")
    public ResponseEntity<TeamEntity> getTeamByInitials(String initials) {
        TeamEntity teamEntity = teamService.getTeamByInitials(initials);
        return new ResponseEntity<>(teamEntity, HttpStatus.OK);
    }

    @GetMapping("/get-team-by-country")
    public ResponseEntity<List<TeamEntity>> getTeamByCountry(String countryName) {
        List tLst = teamService.getTeamByCountry(countryName);
        return new ResponseEntity<>(tLst, HttpStatus.OK);
    }

    @PostMapping("/create-team")
    public ResponseEntity<String> createTeam(@RequestBody TeamEntity teamEntity) {
        teamService.createTeam(teamEntity);
        return teamService.createTeam(teamEntity) != null? new ResponseEntity<>("Team created", HttpStatus.OK) : new ResponseEntity<>("Team already exists", HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/update-team")
    public ResponseEntity<TeamEntity> updateTeam(@RequestBody TeamEntity teamEntity) {
        teamService.updateTeam(teamEntity);
        return new ResponseEntity<>(teamEntity, HttpStatus.OK);
    }
}
