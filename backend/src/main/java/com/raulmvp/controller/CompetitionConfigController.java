package com.raulmvp.controller;

import com.raulmvp.entity.CompetitionConfigEntity;
import com.raulmvp.model.dto.CompetitionConfigDto;
import com.raulmvp.service.CompetitionConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/competition-config")
public class CompetitionConfigController {

    @Autowired
    private CompetitionConfigService competitionConfigService;

    @PostMapping("/create")
    public ResponseEntity<CompetitionConfigEntity> createCompetitionConfig(@RequestBody CompetitionConfigDto aCompetitionConfigDto) {
        CompetitionConfigEntity competitionConfig = competitionConfigService.createCompetitionConfig(aCompetitionConfigDto);
        return new ResponseEntity<>(competitionConfig, HttpStatus.OK);
    }

    @GetMapping("/by-id")
    public ResponseEntity<CompetitionConfigEntity> getCompetitionConfig(@RequestBody Integer aId) {
        CompetitionConfigEntity competitionConfig = competitionConfigService.getCompetitionConfig(aId);
        return new ResponseEntity<>(competitionConfig, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<CompetitionConfigEntity> updateCompetitionConfig(@RequestBody CompetitionConfigEntity aCompetitionConfig) {
        CompetitionConfigEntity competitionConfig = competitionConfigService.updateCompetitionConfig(aCompetitionConfig);
        return new ResponseEntity<>(competitionConfig, HttpStatus.OK);
    }
}
