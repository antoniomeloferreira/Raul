package com.raulmvp.controller;

import com.raulmvp.entity.TeamRankEntity;
import com.raulmvp.service.TeamRankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team-rank")
public class TeamRankController {

    @Autowired
    private TeamRankService teamRankService;

    @GetMapping("/get-team-rank")
    public ResponseEntity<TeamRankEntity> getTeamRank(String teamName, Integer universeId) {
        TeamRankEntity teamRankEntity = teamRankService.getTeamRank(teamName, universeId);
        return new ResponseEntity<>(teamRankEntity, HttpStatus.OK);
    }

    @GetMapping("/get-team-rank-universe")
    public ResponseEntity<List<TeamRankEntity>> getTeamRankByUniverseId(Integer universeId) {
        List tLst = teamRankService.getTeamRankByUniverseId(universeId);
        return new ResponseEntity<>(tLst, HttpStatus.OK);
    }

    @PutMapping("/set-team-rank")
    public ResponseEntity<TeamRankEntity> setTeamRank (@RequestBody TeamRankEntity teamRankEntity) {
        teamRankService.setTeamRank(teamRankEntity);
        return new ResponseEntity<>(teamRankEntity, HttpStatus.OK);
    }
}
