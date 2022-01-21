package com.raulmvp.service;

import com.raulmvp.dao.TeamDao;
import com.raulmvp.entity.TeamEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    TeamDao teamDao;

    public TeamEntity createTeam(TeamEntity teamEntity) {
        return teamDao.createTeam(teamEntity);
    }

    public List<TeamEntity> getAllTeams() {
        return teamDao.getAllTeams();
    }

    public TeamEntity getTeamByInitials(String initials) {
        return teamDao.getTeamByInitials(initials);
    }

    public List<TeamEntity> getTeamByCountry(String countryName) {
        return teamDao.getTeamsByCountry(countryName);
    }

    public TeamEntity updateTeam(TeamEntity teamEntity) {
         return teamDao.updateTeam(teamEntity);
    }
}
