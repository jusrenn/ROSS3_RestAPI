package com.renkoglu.ross3.Business;

import com.renkoglu.ross3.DataAccess.OrderDAO;
import com.renkoglu.ross3.Entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderManager implements IService<Order> {

    @Autowired
    private OrderDAO orderDal;

    public OrderManager(OrderDAO orderDal) {
        this.orderDal = orderDal;
    }

    @Override
    @Transactional
    public List<Order> getAll() {
        return this.orderDal.getAll();
    }

    @Override
    @Transactional
    public Order getById(int id) {
        return this.orderDal.getById(id);
    }

    @Override
    public void add(Order order) {
        this.orderDal.add(order);
    }

    @Override
    public void update(Order order) {}

    @Override
    public void delete(Order order) {
        this.orderDal.delete(order);
    }
}
