package com.raulmvp.dao;

import com.raulmvp.entity.UniverseEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UniverseDao extends AbstractDao {

    public UniverseEntity createUniverse(UniverseEntity universeEntity) {
        em.persist(universeEntity);
        return universeEntity;
    }

    public UniverseEntity getUniverseById(int id) {
        return em.find(UniverseEntity.class, id);
    }

    public List<UniverseEntity> getUniverseListByUsername(String username) {
        List<UniverseEntity> uLst = new ArrayList<>();
        Query q = em.createNamedQuery("UniverseEntity.getByUsername");
        q.setParameter("username", username);

        uLst = q.getResultList();
        return uLst;
    }

    public UniverseEntity getUniverseByName(String name) {

        Query q = em.createNamedQuery("UniverseEntity.getByName");
        q.setParameter("name", name);

        UniverseEntity universeEntity = (UniverseEntity) q.getSingleResult();

        return universeEntity;
    }

    public void deleteUniverse(String name) {
        UniverseEntity universeEntity = getUniverseByName(name);
        em.remove(universeEntity);
    }
}
