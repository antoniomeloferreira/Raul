package com.raulmvp.dao;

import com.raulmvp.entity.CompetitionConfigEntity;
import org.springframework.stereotype.Repository;

@Repository
public class CompetitionConfigDao extends AbstractDao {

    public CompetitionConfigEntity createCompetitionConfig(CompetitionConfigEntity competitionConfig) {
        em.persist(competitionConfig);
        return  competitionConfig;
    }

    public CompetitionConfigEntity getCompetitionConfig(Integer id) {
        return em.find(CompetitionConfigEntity.class, id);
    }

    public CompetitionConfigEntity updateCompetitionConfig(CompetitionConfigEntity competitionConfigEntity) {

        if(competitionConfigEntity.getId() == null) {
            return null;
        }

        CompetitionConfigEntity uCompetitionConfig = getCompetitionConfig(competitionConfigEntity.getId());
        uCompetitionConfig.setNumOfUsers(competitionConfigEntity.getNumOfUsers());
        uCompetitionConfig.setNumOfRounds(competitionConfigEntity.getNumOfRounds());
        uCompetitionConfig.setReverse(competitionConfigEntity.isReverse());
        em.merge(uCompetitionConfig);

        return uCompetitionConfig;
    }

}
