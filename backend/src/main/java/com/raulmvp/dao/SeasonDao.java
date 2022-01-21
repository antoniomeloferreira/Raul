package com.raulmvp.dao;

import com.raulmvp.entity.SeasonEntity;
import org.springframework.stereotype.Repository;

@Repository
public class SeasonDao extends AbstractDao {

    public SeasonEntity getSeasonById(Integer aId) {
        return em.find(SeasonEntity.class, aId);
    }

}
