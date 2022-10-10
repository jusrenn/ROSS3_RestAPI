package com.renkoglu.ross3.Business;

import com.renkoglu.ross3.Entities.IEntity;

import java.util.List;

public interface IService<T extends IEntity> {
    List<T> getAll();
    T getById(int id);
    void add(T object);
    void update(T object);
    void delete(T object);
}
