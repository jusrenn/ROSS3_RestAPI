package com.renkoglu.ross3.DataAccess.Hibernate;

import com.renkoglu.ross3.DataAccess.AdminUserDAO;
import com.renkoglu.ross3.Entities.AdminUser;
import com.renkoglu.ross3.Entities.Category;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AdminUserDAL implements AdminUserDAO {

    @Autowired
    EntityManager entityManager;

    public AdminUserDAL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<AdminUser> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<AdminUser> adminUsers= session.createQuery("from AdminUser", AdminUser.class).getResultList();
        return adminUsers;
    }

    @Override
    @Transactional
    public AdminUser getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        AdminUser adminUser = session.get(AdminUser.class, id);
        return adminUser;
    }

    @Override
    @Transactional
    public void add(AdminUser adminUser) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(adminUser);
    }

    @Override
    @Transactional
    public void update(AdminUser adminUser) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(adminUser);
    }

    @Override
    @Transactional
    public void delete(AdminUser adminUser) {
        Session session = entityManager.unwrap(Session.class);
        AdminUser adminUserToDelete = session.get(AdminUser.class, adminUser.getId());
        session.delete(adminUserToDelete);
    }
}
