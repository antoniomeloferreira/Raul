package com.raulmvp.dao;

import com.raulmvp.entity.CompetitionEntity;
import com.raulmvp.model.Competition;
import org.springframework.stereotype.Repository;

@Repository
public class CompetitionDao extends AbstractDao {

    public boolean saveCompetition(Competition competition) {

        CompetitionEntity competitionEntity = competitionToCompetitionEntity(competition);

        if(findCompetitionByEdition(competition.getEdition()) == null) {
            em.persist(competitionEntity);
            return true;
        } else {
            em.merge(competitionEntity);
            return false;
        }
    }

    public CompetitionEntity findCompetitionByEdition(Integer edition) {

        return em.find(CompetitionEntity.class, edition);
    }

    public void deleteCompetitionByEdition(Integer edition) {

        CompetitionEntity competition = findCompetitionByEdition(edition);
        em.remove(edition);
    }

    //TODO: CompetitionEntity competitionToCompetitionEntity();

    public CompetitionEntity competitionToCompetitionEntity(Competition competition) {

        CompetitionEntity competitionEntity = new CompetitionEntity();

        competitionEntity.setEdition(competition.getEdition() == 0 ? null : competition.getEdition());
        competitionEntity.setName(competition.getName());
        competitionEntity.setOver(competition.isOver());

        String competitionWinnerName = competition.getWinner() == null ? null : competition.getWinner().getUserName();
        competitionEntity.setWinnerUsername(competitionWinnerName);

        return competitionEntity;
    }
}
