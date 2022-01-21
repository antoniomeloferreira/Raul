package com.raulmvp.service;

import com.raulmvp.dao.CompetitionConfigDao;
import com.raulmvp.entity.CompetitionConfigEntity;
import com.raulmvp.model.dto.CompetitionConfigDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompetitionConfigService {

    @Autowired
    CompetitionConfigDao competitionConfigDao;

    public CompetitionConfigEntity createCompetitionConfig(CompetitionConfigDto aCompetitionConfigDto) {

        CompetitionConfigEntity competitionConfigEntity = new CompetitionConfigEntity();
        competitionConfigEntity.setNumOfRounds(aCompetitionConfigDto.getNumOfRounds());
        competitionConfigEntity.setNumOfUsers(aCompetitionConfigDto.getNumOfUsers());
        competitionConfigEntity.setReverse(aCompetitionConfigDto.isReverse());

        return competitionConfigDao.createCompetitionConfig(competitionConfigEntity);
    }

    public CompetitionConfigEntity getCompetitionConfig(Integer aId) {
        return competitionConfigDao.getCompetitionConfig(aId);
    }

    public CompetitionConfigEntity updateCompetitionConfig(CompetitionConfigEntity aCompetitionConfig) {
        return competitionConfigDao.updateCompetitionConfig(aCompetitionConfig);
    }
}
