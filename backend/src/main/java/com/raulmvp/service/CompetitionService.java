package com.raulmvp.service;

import com.raulmvp.calendarmaker.CalendarMaker;
import com.raulmvp.dao.CompetitionDao;
import com.raulmvp.dao.GameDao;
import com.raulmvp.model.Competition;
import com.raulmvp.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitionService {

    @Autowired
    private CompetitionDao competitionDao;

    @Autowired
    private GameDao gameDao;

    CalendarMaker calendarMaker = new CalendarMaker();

    public Competition createCompetition() {

        Competition competition = new Competition();

        List<Game> gameList = calendarMaker.getFinalCalendar();
        competition.setCalendar(gameList);

        competitionDao.saveCompetition(competition);
        gameDao.saveCalendar(competition.getCalendar());

        calendarMaker.printCalendar(gameList);
        System.out.println("GAME LIST: FINAL : " + gameList.size());

        return competition;
    }
}
