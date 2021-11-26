package com.raulmvp.model;
import com.raulmvp.utils.MathUtils;

public class CompetitionConfig {

    private final int numberOfUsers;
    private final int numberOfRounds;
    private boolean isReverse;

    public CompetitionConfig(final int numberOfUsers, final int numberOfRounds) {
        this.numberOfUsers = numberOfUsers;
        this.numberOfRounds = numberOfRounds;
    }

    public int getNumberOfGamesPerMatchWeek() {
        return MathUtils.isEven(numberOfUsers) ? numberOfUsers / 2 : (numberOfUsers -1) / 2;
    }

    public int getMatchWeeksPerRound() {
        return MathUtils.isEven(numberOfUsers) ? numberOfUsers - 1 : numberOfUsers;
    }

    public int getTotalNumberOfGames() {
        return numberOfRounds * (getNumberOfGamesPerMatchWeek() * getMatchWeeksPerRound());
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public boolean isReverse() {
        return isReverse;
    }

    public void setReverse(boolean reverse) {
        isReverse = reverse;
    }
}
