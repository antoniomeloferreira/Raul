package com.raulmvp.dao;

import com.raulmvp.entity.TeamEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TeamDao extends AbstractDao {

    public List<TeamEntity> getAllTeams() {
        List<TeamEntity> tLst = new ArrayList<>();
        Query q = em.createNamedQuery("TeamEntity.findAllTeams");

        tLst = q.getResultList();
        return tLst;
    }

    public TeamEntity getTeamByInitials(String initials) {

        if(initials == null ||  !(initials.length() > 0) ) {
            return null;
        }

        Query q = em.createNamedQuery("TeamEntity.findTeamByName");
        q.setParameter("initials", initials);

        TeamEntity teamEntity = (TeamEntity) q.getSingleResult();

        return teamEntity;
    }

    public List<TeamEntity> getTeamsByCountry(String countryName) {
        List<TeamEntity> tLst = new ArrayList<>();
        Query q = em.createNamedQuery("TeamEntity.findTeamByCountry");
        q.setParameter("country_name", countryName);

        tLst = q.getResultList();
        return tLst;
    }

    public TeamEntity createTeam(TeamEntity teamEntity) {

        if(getTeamByInitials(teamEntity.getInitials()) == null) {
            em.persist(teamEntity);
        } else {
            return null;
        }


        return teamEntity;
    }

    public TeamEntity updateTeam(TeamEntity teamEntity) {

        if(getTeamByInitials(teamEntity.getInitials()) == null) {
            return null;
        }

        TeamEntity uTeam = getTeamByInitials(teamEntity.getInitials());
        uTeam.setName(teamEntity.getName());
        uTeam.setInitials(teamEntity.getInitials());
        uTeam.setNationalTeam(teamEntity.isNationalTeam());
        uTeam.setCountryName(teamEntity.getCountryName());
        em.merge(uTeam);

        return uTeam;
    }
}
