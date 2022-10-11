package com.renkoglu.ross3.DataAccess.Hibernate;

import com.renkoglu.ross3.DataAccess.MessageDAO;
import com.renkoglu.ross3.Entities.Message;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MessageDAL implements MessageDAO {

    @Autowired
    private EntityManager entityManager;

    public MessageDAL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Message> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Message> messages= session.createQuery("from Message", Message.class).getResultList();
        return messages;
    }

    @Override
    @Transactional
    public Message getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Message message = session.get(Message.class, id);
        return message;
    }

    @Override
    @Transactional
    public void add(Message message) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(message);
    }

    @Override
    @Transactional
    public void update(Message message) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(message);
    }

    @Override
    @Transactional
    public void delete(Message message) {
        Session session = entityManager.unwrap(Session.class);
        Message messageToDelete = session.get(Message.class, message.getId());
        session.delete(messageToDelete);
    }
}
