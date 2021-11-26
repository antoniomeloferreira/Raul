package com.raulmvp.calendarmaker;

import com.raulmvp.TEAM.PotTeam;
import com.raulmvp.model.Game;
import com.raulmvp.model.Team;
import com.raulmvp.utils.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class CalendarMaker {

    private List<Game> gameList = new ArrayList<>();

    private List<Team> potAList = CollectionUtils.generateListFromArray(PotTeam.potA);
    private List<Team> potBList = CollectionUtils.generateListFromArray(PotTeam.potB);


    public void printCalendar(List<Game> gameList) {
        for(Game g : gameList) {
            System.out.println(g.toString());
        }
    }

    public List<Game> getFinalCalendar() {

        draft(potAList);
        draft(potBList);

        List<Game> finalCalendar = reverseCalendar(firstRoundCalendar(gameList));
        printCalendar(finalCalendar);

        return finalCalendar;
    }

    public List<Game> reverseCalendar(List<Game> gameList) {

        List<Game> reverseGame = new ArrayList<>();

        for(Game g : gameList) {
            Team home = g.getAwayTeam();
            Team away = g.getHomeTeam();
            reverseGame.add(createGame(home, away));
        }

        gameList.addAll(reverseGame);
        return gameList;
    }

    public List<Game> firstRoundCalendar(List<Game> gameList) {

        this.gameList = CollectionUtils.randomizeList(gameList);
        return this.gameList;
    }

    public void draft(List<Team> teamList) {

        List<Team> randomTeamList = CollectionUtils.randomizeList(teamList);

        while(randomTeamList.size() > 0) {

            Team homeTeam = randomTeamList.remove(0);
            Team awayTeam = randomTeamList.remove(0);

            this.gameList.add(createGame(homeTeam, awayTeam));
        }
    }

    public Game createGame(Team homeTeam, Team awayTeam) {

        Game game = new Game(homeTeam, awayTeam);

        return game;
    }

    public List<Game> getGameList() {
        return gameList;
    }
}
