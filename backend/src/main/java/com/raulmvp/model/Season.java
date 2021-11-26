package com.raulmvp.model;

public class Season {

    private int id;
    private int seasonCounter;
    private Age ageId;

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

    public Age getAgeId() {
        return ageId;
    }

    public void setAgeId(Age ageId) {
        this.ageId = ageId;
    }
}
