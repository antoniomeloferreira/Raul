package com.raulmvp.dao;

import com.raulmvp.entity.UniverseEntity;
import com.raulmvp.model.Universe;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

@Repository
public class UniverseDao extends AbstractDao {

    public UniverseEntity getUniverseById(int id) {

        Query q = em.createNamedQuery("UniverseEntity.findById", UniverseEntity.class);
        q.setParameter("id", id);

        return (UniverseEntity) q.getSingleResult();
    }
}
