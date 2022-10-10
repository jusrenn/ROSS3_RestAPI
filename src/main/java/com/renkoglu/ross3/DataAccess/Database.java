package com.renkoglu.ross3.DataAccess;

import com.renkoglu.ross3.Entities.IEntity;
import com.renkoglu.ross3.Entities.Member;

import java.util.List;

public interface Database<T extends IEntity> {
    List<T> getAll();
    T getById(int id);
    void add(T object);
    void update(T object);
    void delete(T object);
}
