package com.raulmvp.model;

public class Age {

    private int id;
    private int ageCounter;
    private Universe universe;

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
        return universe;
    }

    public void setUniverse(Universe universe) {
        this.universe = universe;
    }
}
