package com.renkoglu.ross3.DataAccess.Hibernate;

import com.renkoglu.ross3.DataAccess.SettingDAO;
import com.renkoglu.ross3.Entities.Setting;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class SettingDAL implements SettingDAO {

    @Autowired
    private EntityManager entityManager;

    public SettingDAL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Setting> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Setting> settings= session.createQuery("from Setting", Setting.class).getResultList();
        return settings;
    }

    @Override
    @Transactional
    public Setting getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Setting setting = session.get(Setting.class, id);
        return setting;
    }

    @Override
    public void add(Setting setting) {}

    @Override
    @Transactional
    public void update(Setting setting) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(setting);
    }

    @Override
    public void delete(Setting setting) {}
}
