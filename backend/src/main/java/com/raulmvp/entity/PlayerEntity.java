package com.raulmvp.entity;

import javax.persistence.*;

@Entity
@Table(name = "player")
public class PlayerEntity {

    @Id
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "team_full_name")
    private String team;

    @Column(name = "nationality")
    private String nationality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
