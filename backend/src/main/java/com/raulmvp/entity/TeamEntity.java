package com.raulmvp.entity;

import javax.persistence.*;

@Entity
@Table(name = "Team")
@NamedQueries(
        {@NamedQuery(name = "TeamEntity.findAllTeams", query = "SELECT t FROM TeamEntity t"),
                @NamedQuery(name = "TeamEntity.findTeamByName", query = "SELECT t FROM TeamEntity t WHERE t.initials=:initials"),
         @NamedQuery(name = "TeamEntity.findTeamByCountry", query = "SELECT t FROM TeamEntity t WHERE t.countryName=:country_name")}
        )
public class TeamEntity {

    @Id
    @Column(name = "initials")
    private String initials;

    @Column(name = "full_name")
    private String name;

    @Column(name = "is_national_team")
    private boolean isNationalTeam;

    @Column(name = "country_name")
    private String countryName;

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNationalTeam() {
        return isNationalTeam;
    }

    public void setNationalTeam(boolean nationalTeam) {
        isNationalTeam = nationalTeam;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
