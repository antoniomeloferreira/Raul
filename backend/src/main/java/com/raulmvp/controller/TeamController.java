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

    @GetMapping("/get-list")
    public ResponseEntity<List<TeamEntity>> getAllTeams() {
        List teamList = teamService.getAllTeams();
        return new ResponseEntity<>(teamList, HttpStatus.OK);
    }

    @GetMapping("/by-name")
    public ResponseEntity<TeamEntity> getTeamByInitials(@RequestBody String aInitials) {
        TeamEntity teamEntity = teamService.getTeamByInitials(aInitials);
        return new ResponseEntity<>(teamEntity, HttpStatus.OK);
    }

    @GetMapping("/by-country")
    public ResponseEntity<List<TeamEntity>> getTeamByCountry(@RequestBody String aCountryName) {
        List teamList = teamService.getTeamByCountry(aCountryName);
        return new ResponseEntity<>(teamList, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<TeamEntity> createTeam(@RequestBody TeamEntity aTeam) {
        TeamEntity teamEntity = teamService.createTeam(aTeam);
        return teamEntity != null ? new ResponseEntity<>(teamEntity, HttpStatus.OK) : new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/update")
    public ResponseEntity<TeamEntity> updateTeam(@RequestBody TeamEntity aTeamEntity) {
        TeamEntity teamEntity = teamService.updateTeam(aTeamEntity);
        return new ResponseEntity<>(teamEntity, HttpStatus.OK);
    }
}
