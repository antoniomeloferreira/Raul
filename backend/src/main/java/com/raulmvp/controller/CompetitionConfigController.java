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

    @PostMapping("/create-competition-config")
    public ResponseEntity<CompetitionConfigEntity> createCompetitionConfig(@RequestBody CompetitionConfigDto competitionConfig) {
        CompetitionConfigEntity saveCompetitionConfig = competitionConfigService.createCompetitionConfig(competitionConfig);
        return new ResponseEntity<>(saveCompetitionConfig, HttpStatus.OK);
    }

    @GetMapping("/get-competition-config")
    public ResponseEntity<CompetitionConfigEntity> getCompetitionConfig(Integer id) {
        CompetitionConfigEntity competitionConfig = competitionConfigService.getCompetitionConfig(id);
        return new ResponseEntity<>(competitionConfig, HttpStatus.OK);
    }

    @PutMapping("/update-competition-config")
    public ResponseEntity<CompetitionConfigEntity> updateCompetitionConfig(@RequestBody CompetitionConfigEntity competitionConfigEntity) {
        CompetitionConfigEntity competitionConfig = competitionConfigService.updateCompetitionConfig(competitionConfigEntity);
        return new ResponseEntity<>(competitionConfig, HttpStatus.OK);
    }
}
