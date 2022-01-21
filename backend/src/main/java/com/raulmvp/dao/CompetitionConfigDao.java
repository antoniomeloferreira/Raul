package com.raulmvp.dao;

import com.raulmvp.entity.CompetitionConfigEntity;
import org.springframework.stereotype.Repository;

@Repository
public class CompetitionConfigDao extends AbstractDao {

    public CompetitionConfigEntity createCompetitionConfig(CompetitionConfigEntity aCompetitionConfig) {
        em.persist(aCompetitionConfig);
        return  aCompetitionConfig;
    }

    public CompetitionConfigEntity getCompetitionConfig(Integer aId) {
        return em.find(CompetitionConfigEntity.class, aId);
    }

    public CompetitionConfigEntity updateCompetitionConfig(CompetitionConfigEntity aCompetitionConfig) {

        if(aCompetitionConfig.getId() == null) {
            return null;
        }

        CompetitionConfigEntity competitionConfigEntity = getCompetitionConfig(aCompetitionConfig.getId());
        competitionConfigEntity.setNumOfUsers(aCompetitionConfig.getNumOfUsers());
        competitionConfigEntity.setNumOfRounds(aCompetitionConfig.getNumOfRounds());
        competitionConfigEntity.setReverse(aCompetitionConfig.isReverse());
        em.merge(competitionConfigEntity);

        return competitionConfigEntity;
    }
}
