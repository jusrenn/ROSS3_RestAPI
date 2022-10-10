package com.renkoglu.ross3.DataAccess.Hibernate;

import com.renkoglu.ross3.DataAccess.OrderDAO;
import com.renkoglu.ross3.Entities.Order;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class OrderDAL implements OrderDAO {

    @Autowired
    private EntityManager entityManager;

    public OrderDAL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Order> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Order> orders= session.createQuery("from Order", Order.class).getResultList();
        return orders;
    }

    @Override
    @Transactional
    public Order getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Order order = session.get(Order.class, id);
        return order;
    }

    @Override
    @Transactional
    public void add(Order order) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(order);
    }

    @Override
    @Transactional
    public void update(Order order) {}

    @Override
    @Transactional
    public void delete(Order order) {
        Session session = entityManager.unwrap(Session.class);
        Order orderToDelete = session.get(Order.class, order.getId());
        session.delete(orderToDelete);
    }
}
