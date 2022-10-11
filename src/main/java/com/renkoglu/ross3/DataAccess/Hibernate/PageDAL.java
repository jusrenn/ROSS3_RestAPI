package com.renkoglu.ross3.DataAccess.Hibernate;

import com.renkoglu.ross3.DataAccess.PageDAO;
import com.renkoglu.ross3.Entities.Category;
import com.renkoglu.ross3.Entities.Page;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PageDAL implements PageDAO {

    @Autowired
    private EntityManager entityManager;

    public PageDAL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Page> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Page> pages= session.createQuery("from Page", Page.class).getResultList();
        return pages;
    }

    @Override
    @Transactional
    public Page getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Page page = session.get(Page.class, id);
        return page;
    }

    @Override
    @Transactional
    public void add(Page page) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(page);
    }

    @Override
    @Transactional
    public void update(Page page) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(page);
    }

    @Override
    @Transactional
    public void delete(Page page) {
        Session session = entityManager.unwrap(Session.class);
        Page pageToDelete = session.get(Page.class, page.getId());
        session.delete(pageToDelete);
    }
}
