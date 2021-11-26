package com.raulmvp.dao;

import com.raulmvp.entity.GameEntity;
import com.raulmvp.model.Game;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class GameDao extends AbstractDao {

    public boolean saveCalendar(List<Game> gameList) {

        List<GameEntity> gameEntityList = gameToGameEntity(gameList);

        for (GameEntity g : gameEntityList) {

            em.persist(g);
        }

        return true;
    }


    private List<GameEntity> gameToGameEntity(List<Game> game) {

        List<GameEntity> gameEntityList = new ArrayList<>();

        for (Game g : game) {

            GameEntity gameEntity = new GameEntity();
            gameEntity.setHomeUser(g.getHomeUser().getUserName());
            gameEntity.setAwayUser(g.getAwayUser().getUserName());
            gameEntity.setHomeTeam(g.getHomeTeam().getFullName());
            gameEntity.setAwayTeam(g.getAwayTeam().getFullName());

            gameEntityList.add(gameEntity);
        }

        return gameEntityList;
    }

}
