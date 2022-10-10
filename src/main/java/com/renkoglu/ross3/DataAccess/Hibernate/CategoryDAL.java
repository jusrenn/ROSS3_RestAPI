package com.renkoglu.ross3.DataAccess.Hibernate;

import com.renkoglu.ross3.DataAccess.CategoryDAO;
import com.renkoglu.ross3.Entities.Category;
import com.renkoglu.ross3.Entities.Member;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CategoryDAL implements CategoryDAO {

    @Autowired
    private EntityManager entityManager;

    public CategoryDAL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Category> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Category> category= session.createQuery("from Category", Category.class).getResultList();
        return category;
    }

    @Override
    @Transactional
    public Category getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Category category = session.get(Category.class, id);
        return category;
    }

    @Override
    @Transactional
    public void add(Category category) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(category);
    }

    @Override
    @Transactional
    public void update(Category category) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(category);
    }

    @Override
    @Transactional
    public void delete(Category category) {
        Session session = entityManager.unwrap(Session.class);
        Category categoryToDelete = session.get(Category.class, category.getId());
        session.delete(categoryToDelete);
    }
}
