package com.raulmvp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Season")
public class SeasonEntity {

    @Id
    private int id;

    @Column(name = "season_counter")
    private int seasonCounter;

    @Column(name = "age_id")
    private int ageId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeasonCounter() {
        return seasonCounter;
    }

    public void setSeasonCounter(int seasonCounter) {
        this.seasonCounter = seasonCounter;
    }

    public int getAgeId() {
        return ageId;
    }

    public void setAgeId(int ageId) {
        this.ageId = ageId;
    }
}
