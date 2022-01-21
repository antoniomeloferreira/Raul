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

    public TeamEntity createTeam(TeamEntity aTeamEntity) {
        return teamDao.createTeam(aTeamEntity);
    }

    public List<TeamEntity> getAllTeams() {
        return teamDao.getAllTeams();
    }

    public TeamEntity getTeamByInitials(String aInitials) {
        return teamDao.getTeamByInitials(aInitials);
    }

    public List<TeamEntity> getTeamByCountry(String aCountryName) {
        return teamDao.getTeamListByCountry(aCountryName);
    }

    public TeamEntity updateTeam(TeamEntity aTeamEntity) {
         return teamDao.updateTeam(aTeamEntity);
    }
}
