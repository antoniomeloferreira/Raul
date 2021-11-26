package com.raulmvp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Age")
public class AgeEntity {

    @Id
    private int id;

    @Column(name = "age_counter")
    private int ageCounter;

    @Column(name = "universe_id")
    private String universeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAgeCounter() {
        return ageCounter;
    }

    public void setAgeCounter(int ageCounter) {
        this.ageCounter = ageCounter;
    }

    public String getUniverseId() {
        return universeId;
    }

    public void setUniverseId(String universeId) {
        this.universeId = universeId;
    }
}
