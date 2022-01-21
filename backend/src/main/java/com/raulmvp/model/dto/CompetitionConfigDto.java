package com.raulmvp.model.dto;

public class CompetitionConfigDto {

    private Integer numOfUsers;
    private Integer numOfRounds;
    private boolean isReverse;

    public Integer getNumOfUsers() {
        return numOfUsers;
    }

    public void setNumOfUsers(Integer numOfUsers) {
        this.numOfUsers = numOfUsers;
    }

    public Integer getNumOfRounds() {
        return numOfRounds;
    }

    public void setNumOfRounds(Integer numOfRounds) {
        this.numOfRounds = numOfRounds;
    }

    public boolean isReverse() {
        return isReverse;
    }

    public void setReverse(boolean reverse) {
        isReverse = reverse;
    }
}
