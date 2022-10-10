package com.renkoglu.ross3.DataAccess.Hibernate;

import com.renkoglu.ross3.DataAccess.PostCodeDAO;
import com.renkoglu.ross3.Entities.PostCode;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PostCodeDAL implements PostCodeDAO {

    @Autowired
    private EntityManager entityManager;

    public PostCodeDAL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<PostCode> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<PostCode> postCodes= session.createQuery("from PostCode", PostCode.class).getResultList();
        return postCodes;
    }

    @Override
    @Transactional
    public PostCode getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        PostCode postCode = session.get(PostCode.class, id);
        return postCode;
    }

    @Override
    @Transactional
    public void add(PostCode postCode) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(postCode);
    }

    @Override
    @Transactional
    public void update(PostCode postCode) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(postCode);
    }

    @Override
    @Transactional
    public void delete(PostCode postCode) {
        Session session = entityManager.unwrap(Session.class);
        PostCode postCodeToDelete = session.get(PostCode.class, postCode.getId());
        session.delete(postCodeToDelete);
    }
}
