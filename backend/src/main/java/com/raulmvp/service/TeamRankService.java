package com.raulmvp.service;

import com.raulmvp.dao.TeamRankDao;
import com.raulmvp.entity.TeamRankEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamRankService {

    @Autowired
    TeamRankDao teamRankDao;

    public TeamRankEntity setTeamRank(TeamRankEntity teamRankEntity) {

        return teamRankDao.setTeamRank(teamRankEntity);
    }

    public TeamRankEntity getTeamRank(String teamName, Integer universeId) {
        return teamRankDao.getTeamRank(teamName, universeId);
    }

    public List<TeamRankEntity> getTeamRankByUniverseId(Integer universeId) {
        return teamRankDao.getTeamRankByUniverseId(universeId);
    }
}
