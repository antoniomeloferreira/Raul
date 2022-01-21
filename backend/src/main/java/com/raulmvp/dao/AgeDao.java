package com.raulmvp.dao;

import com.raulmvp.entity.AgeEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

@Repository
public class AgeDao extends AbstractDao {

    public AgeEntity getUniverseById(Integer aUniverseId) {
       return em.find(AgeEntity.class, aUniverseId);
    }
}
