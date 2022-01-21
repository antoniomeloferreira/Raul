package com.raulmvp.dao;

import com.raulmvp.entity.UniverseEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UniverseDao extends AbstractDao {

    private static final String PARAMETER_NAME = "name";
    private static final String PARAMETER_USERNAME = "username";

    public UniverseEntity createUniverse(UniverseEntity universeEntity) {
        em.persist(universeEntity);
        return universeEntity;
    }

    public UniverseEntity getUniverseById(int aId) {
        return em.find(UniverseEntity.class, aId);
    }

    public List<UniverseEntity> getUniverseListByUsername(String aUsername) {

        Query q = em.createNamedQuery("UniverseEntity.getByUsername");
        q.setParameter(PARAMETER_USERNAME, aUsername);

        return q.getResultList();
    }

    public UniverseEntity getUniverseByName(String aName) {

        Query q = em.createNamedQuery("UniverseEntity.getByName");
        q.setParameter(PARAMETER_NAME, aName);

        UniverseEntity universeEntity = (UniverseEntity) q.getSingleResult();

        return universeEntity;
    }

    public Boolean deleteUniverse(String aName) {

        UniverseEntity universeEntity = getUniverseByName(aName);
        Boolean isDeleted = Boolean.FALSE;

        if (universeEntity == null) {
            return isDeleted;
        }

        try {
            em.remove(universeEntity);
            isDeleted = Boolean.TRUE;
        } catch (IllegalArgumentException e) {
            System.out.println("UniverseDao - Delete: " + e);
        }

        return isDeleted;
    }
}