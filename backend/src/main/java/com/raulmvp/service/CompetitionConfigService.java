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

    public CompetitionConfigEntity createCompetitionConfig(CompetitionConfigDto competitionConfig) {

        CompetitionConfigEntity createCompetitionConfigEntity = new CompetitionConfigEntity();
        createCompetitionConfigEntity.setNumOfRounds(competitionConfig.getNumOfRounds());
        createCompetitionConfigEntity.setNumOfUsers(competitionConfig.getNumOfUsers());
        createCompetitionConfigEntity.setReverse(competitionConfig.isReverse());

        return competitionConfigDao.createCompetitionConfig(createCompetitionConfigEntity);
    }

    public CompetitionConfigEntity getCompetitionConfig(Integer id) {
        return competitionConfigDao.getCompetitionConfig(id);
    }

    public CompetitionConfigEntity updateCompetitionConfig(CompetitionConfigEntity competitionConfigEntity) {
        return competitionConfigDao.updateCompetitionConfig(competitionConfigEntity);
    }
}
