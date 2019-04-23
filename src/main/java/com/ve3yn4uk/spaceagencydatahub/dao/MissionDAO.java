package com.ve3yn4uk.spaceagencydatahub.dao;

import com.ve3yn4uk.spaceagencydatahub.entity.Mission;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by 8e3Yn4uK on 23.04.2019
 */

@Repository
public class MissionDAO implements IMissionDAO {

    private EntityManager entityManager;

    @Autowired
    public MissionDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Mission mission) {

        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(mission);

    }

    @Override
    public void deleteById(int id) {

        Session currentSession = entityManager.unwrap(Session.class);
        Query myQuery = currentSession.createQuery("delete from Mission where id=:missionId");
        myQuery.setParameter("missionId", id);
        myQuery.executeUpdate();

    }

    @Override
    public List<Mission> findAll() {

        Session currentSession = entityManager.unwrap(Session.class);
        Query<Mission> myQuery = currentSession.createQuery("from Mission", Mission.class);
        List<Mission> missions = myQuery.getResultList();

        return missions;
    }
}
