package com.renkoglu.ross3.Business;

import com.renkoglu.ross3.DataAccess.MessageDAO;
import com.renkoglu.ross3.Entities.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MessageManager implements IService<Message> {

    @Autowired
    private MessageDAO messageDal;

    public MessageManager(MessageDAO messageDal) {
        this.messageDal = messageDal;
    }

    @Override
    @Transactional
    public List<Message> getAll() {
        return this.messageDal.getAll();
    }

    @Override
    @Transactional
    public Message getById(int id) {
        return this.messageDal.getById(id);
    }

    @Override
    @Transactional
    public void add(Message message) {
        this.messageDal.add(message);
    }

    @Override
    @Transactional
    public void update(Message message) {
        this.messageDal.update(message);
    }

    @Override
    @Transactional
    public void delete(Message message) {
        this.messageDal.delete(message);
    }
}
