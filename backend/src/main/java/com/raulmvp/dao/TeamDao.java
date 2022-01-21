package com.raulmvp.dao;

import com.raulmvp.entity.TeamEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TeamDao extends AbstractDao {

    private static final String PARAMETER_INITIALS = "initials";
    private static final String PARAMETER_COUNTRY_NAME = "country_name";

    public List<TeamEntity> getAllTeams() {
        Query q = em.createNamedQuery("TeamEntity.findAllTeams");
        return q.getResultList();
    }

    public TeamEntity getTeamByInitials(String aInitials) {

        if(aInitials == null || (aInitials.length() < 1) ) {
            return null;
        }

        Query q = em.createNamedQuery("TeamEntity.findTeamByName");
        q.setParameter(PARAMETER_INITIALS, aInitials);

        TeamEntity teamEntity = (TeamEntity) q.getSingleResult();

        return teamEntity;
    }

    public List<TeamEntity> getTeamListByCountry(String aCountryName) {

        Query q = em.createNamedQuery("TeamEntity.findTeamByCountry");
        q.setParameter(PARAMETER_COUNTRY_NAME, aCountryName);

        return q.getResultList();
    }

    public TeamEntity createTeam(TeamEntity aTeam) {

        if(getTeamByInitials(aTeam.getInitials()) != null) {
            return null;
        }

        em.persist(aTeam);

        return aTeam;
    }

    public TeamEntity updateTeam(TeamEntity aTeam) {

        if(getTeamByInitials(aTeam.getInitials()) == null) {
            return null;
        }

        TeamEntity teamEntity = getTeamByInitials(aTeam.getInitials());
        teamEntity.setName(aTeam.getName());
        teamEntity.setInitials(aTeam.getInitials());
        teamEntity.setNationalTeam(aTeam.isNationalTeam());
        teamEntity.setCountryName(aTeam.getCountryName());
        em.merge(teamEntity);

        return teamEntity;
    }
}
