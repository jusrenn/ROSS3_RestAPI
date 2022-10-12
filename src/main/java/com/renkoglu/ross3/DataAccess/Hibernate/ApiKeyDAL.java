package com.renkoglu.ross3.DataAccess.Hibernate;

import com.renkoglu.ross3.DataAccess.ApiKeyDAO;
import com.renkoglu.ross3.Entities.ApiKey;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ApiKeyDAL implements ApiKeyDAO {

    @Autowired
    private EntityManager entityManager;

    public ApiKeyDAL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<ApiKey> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<ApiKey> apiKeys= session.createQuery("from ApiKey", ApiKey.class).getResultList();
        return apiKeys;
    }

    @Override
    @Transactional
    public ApiKey getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        ApiKey apiKey = session.get(ApiKey.class, id);
        return apiKey;
    }

    @Override
    @Transactional
    public void add(ApiKey apiKey) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(apiKey);
    }

    @Override
    @Transactional
    public void update(ApiKey apiKey) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(apiKey);
    }

    @Override
    @Transactional
    public void delete(ApiKey apiKey) {
        Session session = entityManager.unwrap(Session.class);
        ApiKey apiKeyToDelete = session.get(ApiKey.class, apiKey.getId());
        session.delete(apiKeyToDelete);
    }
}
