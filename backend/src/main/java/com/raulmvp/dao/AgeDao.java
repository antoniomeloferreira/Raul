package com.raulmvp.dao;

import com.raulmvp.entity.AgeEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

@Repository
public class AgeDao extends AbstractDao {

    public AgeEntity getUniverseById(int id) {
       return em.find(AgeEntity.class, id);
    }
}
