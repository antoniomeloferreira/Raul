package com.raulmvp.model;

public class Age {

    private int id;
    private int ageCounter;
    private Universe universeId;

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

    public Universe getUniverse() {
        return universeId;
    }

    public void setUniverse(Universe universe) {
        this.universeId = universe;
    }
}
