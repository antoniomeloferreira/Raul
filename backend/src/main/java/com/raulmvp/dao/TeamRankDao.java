package com.raulmvp.dao;

import com.raulmvp.entity.TeamRankEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TeamRankDao extends AbstractDao {


    public TeamRankEntity setTeamRank(TeamRankEntity teamRankEntity) {

        if(teamRankEntity.getTeamName() == null) {
            return null;
        }

        TeamRankEntity setTeamRank = getTeamRank(teamRankEntity.getTeamName(), teamRankEntity.getUniverseId());
        setTeamRank.setUniverseId(teamRankEntity.getUniverseId());
        setTeamRank.setTeamName(teamRankEntity.getTeamName());
        setTeamRank.setRanking(teamRankEntity.getRanking());
        setTeamRank.setDefault(teamRankEntity.getDefault());
        em.merge(teamRankEntity);

        return setTeamRank;
    }

    public TeamRankEntity getTeamRank(String teamName, Integer universeId) {

        if(teamName == null || !(teamName.length() > 0)) {
            return null;
        }

        Query q = em.createNamedQuery("TeamRankEntity.getTeamRank");
        q.setParameter("team_name", teamName);
        q.setParameter("universe_id", universeId);

        TeamRankEntity teamRankEntity = (TeamRankEntity) q.getSingleResult();

        return teamRankEntity;
    }

    public List<TeamRankEntity> getTeamRankByUniverseId(Integer universeId) {
        List<TeamRankEntity> tLst = new ArrayList<>();
        Query q = em.createNamedQuery("TeamRankEntity.getTeamRankByUniverseId");
        q.setParameter("universe_id", universeId);

        tLst = q.getResultList();
        return tLst;
    }

}
