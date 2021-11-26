package com.raulmvp.model;
import com.raulmvp.utils.MathUtils;

public class CompetitionConfig {

    private final int numberOfUsers;
    private final int numberOfRounds;

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

}
