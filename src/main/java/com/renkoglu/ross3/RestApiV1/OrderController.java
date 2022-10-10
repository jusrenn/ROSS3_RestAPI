package com.renkoglu.ross3.RestApiV1;

import com.renkoglu.ross3.Business.IService;
import com.renkoglu.ross3.Entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    @Autowired
    @Qualifier("orderManager")
    private IService orderManager;

    public OrderController(IService orderManager) {
        this.orderManager = orderManager;
    }

    @GetMapping("/orders")
    public List<Order> orders() {
        return orderManager.getAll();
    }

    @GetMapping("/orders/{id}")
    public Order getById(@PathVariable int id) {
        return (Order) orderManager.getById(id);
    }

    @PostMapping("/orders")
    public void add(@RequestBody Order order) {
        orderManager.add(order);
    }

    @DeleteMapping("/orders")
    public void delete(@RequestBody Order order) {
        orderManager.delete(order);
    }
}
