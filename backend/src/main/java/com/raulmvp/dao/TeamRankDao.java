package com.raulmvp.dao;

import com.raulmvp.entity.TeamRankEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TeamRankDao extends AbstractDao {

    private static final String PARAMETER_UNIVERSE_ID = "universe_id";
    private static final String PARAMETER_TEAM_NAME = "team_name";


    public TeamRankEntity getTeamRank(String teamName, Integer universeId) {

        if(teamName == null || !(teamName.length() > 0)) {
            return null;
        }

        Query q = em.createNamedQuery("TeamRankEntity.getTeamRank");
        q.setParameter(PARAMETER_TEAM_NAME, teamName);
        q.setParameter(PARAMETER_UNIVERSE_ID, universeId);

        TeamRankEntity teamRankEntity = (TeamRankEntity) q.getSingleResult();

        return teamRankEntity;
    }

    public TeamRankEntity setTeamRank(TeamRankEntity aTeamRank) {

        if(aTeamRank.getTeamName() == null) {
            return null;
        }

        TeamRankEntity teamRank = getTeamRank(aTeamRank.getTeamName(), aTeamRank.getUniverseId());
        teamRank.setRanking(aTeamRank.getRanking());
        teamRank.setDefault(aTeamRank.getDefault());
        em.merge(aTeamRank);

        return teamRank;
    }

    public List<TeamRankEntity> getTeamRankListByUniverseId(Integer aUniverseId) {

        List<TeamRankEntity> teamRankList;
        Query q = em.createNamedQuery("TeamRankEntity.getTeamRankListByUniverseId");
        q.setParameter(PARAMETER_UNIVERSE_ID, aUniverseId);

        teamRankList = q.getResultList();
        return teamRankList;
    }

}
