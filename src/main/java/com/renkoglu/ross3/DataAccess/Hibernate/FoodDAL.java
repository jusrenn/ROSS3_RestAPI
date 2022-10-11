package com.renkoglu.ross3.DataAccess.Hibernate;

import com.renkoglu.ross3.DataAccess.FoodDAO;
import com.renkoglu.ross3.Entities.Food;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class FoodDAL implements FoodDAO {

    @Autowired
    private EntityManager entityManager;

    public FoodDAL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Food> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Food> foods= session.createQuery("from Food", Food.class).getResultList();
        return foods;
    }

    @Override
    @Transactional
    public Food getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Food food = session.get(Food.class, id);
        return food;
    }

    @Override
    @Transactional
    public void add(Food food) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(food);
    }

    @Override
    @Transactional
    public void update(Food food) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(food);
    }

    @Override
    @Transactional
    public void delete(Food food) {
        Session session = entityManager.unwrap(Session.class);
        Food foodToDelete = session.get(Food.class, food.getId());
        session.delete(foodToDelete);
    }
}
