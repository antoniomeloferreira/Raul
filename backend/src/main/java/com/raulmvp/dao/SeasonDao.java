package com.raulmvp.dao;

import com.raulmvp.entity.SeasonEntity;
import org.springframework.stereotype.Repository;

@Repository
public class SeasonDao extends AbstractDao {

    public SeasonEntity findSeasonById(Integer id) {
        return em.find(SeasonEntity.class, id);
    }

}
