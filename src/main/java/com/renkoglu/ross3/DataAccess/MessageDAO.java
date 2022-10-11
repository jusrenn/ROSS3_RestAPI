package com.renkoglu.ross3.DataAccess;

import com.renkoglu.ross3.Entities.Message;

import java.util.List;

public interface MessageDAO {
    List<Message> getAll();
    Message getById(int id);
    void add(Message message);
    void update(Message message);
    void delete(Message message);
}
