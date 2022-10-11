package com.renkoglu.ross3.DataAccess;

import com.renkoglu.ross3.Entities.Order;

import java.util.List;

public interface OrderDAO {
    List<Order> getAll();
    Order getById(int id);
    void add(Order order);
    void update(Order order);
    void delete(Order order);
}
