package com.raulmvp.dao;

import com.raulmvp.entity.UniverseEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UniverseDao extends AbstractDao {

    public UniverseEntity getUniverseById(int id) {

        return em.find(UniverseEntity.class, id);
    }

    public List<UniverseEntity> getUniverseListByUsername(String username) {
        List<UniverseEntity> uLst = new ArrayList<>();
        Query q = em.createNamedQuery("UniverseEntity.findByUsername");
        q.setParameter("username", username);

        uLst = q.getResultList();
        return uLst;
    }
}
