package com.raulmvp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.raulmvp.entity.TeamRankEntity;
import com.raulmvp.service.TeamRankService;


@RestController
@RequestMapping("/teamrank")
public class TeamRankController {

    @Autowired
    private TeamRankService teamRankService;

    @GetMapping("/by-team")
    public ResponseEntity<TeamRankEntity> getTeamRank(@RequestBody TeamRankEntity aTeamRank) {
        TeamRankEntity teamRankEntity = teamRankService.getTeamRank(aTeamRank);
        return new ResponseEntity<>(teamRankEntity, HttpStatus.OK);
    }

    @GetMapping("/list-by-universe")
    public ResponseEntity<List<TeamRankEntity>> getTeamRankListByUniverseId(@RequestBody Integer aUniverseId) {
        List teamRankList = teamRankService.getTeamRankListByUniverseId(aUniverseId);
        return new ResponseEntity<>(teamRankList, HttpStatus.OK);
    }

    @PutMapping("/set-teamrank")
    public ResponseEntity<TeamRankEntity> setTeamRank (@RequestBody TeamRankEntity aTeamRank) {
        teamRankService.setTeamRank(aTeamRank);
        return new ResponseEntity<>(aTeamRank, HttpStatus.OK);
    }
}
