package com.raulmvp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raulmvp.dao.TeamRankDao;
import com.raulmvp.entity.TeamRankEntity;

@Service
public class TeamRankService {

    @Autowired
    TeamRankDao teamRankDao;


    public TeamRankEntity getTeamRank(TeamRankEntity aTeamRank) {
        return teamRankDao.getTeamRank(aTeamRank.getTeamName(), aTeamRank.getUniverseId());
    }

    public TeamRankEntity setTeamRank(TeamRankEntity teamRankEntity) {
        return teamRankDao.setTeamRank(teamRankEntity);
    }

    public List<TeamRankEntity> getTeamRankListByUniverseId(Integer universeId) {
        return teamRankDao.getTeamRankListByUniverseId(universeId);
    }
}
