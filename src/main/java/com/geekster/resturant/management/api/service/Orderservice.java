package com.geekster.resturant.management.api.service;

import com.geekster.resturant.management.api.model.Order;
import com.geekster.resturant.management.api.repo.IOrderrepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service

public class Orderservice {
    private IOrderrepo iOrderrepo;
    public void placeOrder(Order order) {
        // Implement order placement logic
        order.setStatus("CREATED");
        order.setDateTime(LocalDateTime.now());
       iOrderrepo.save(order);
    }

    public List<Order> getAllOrdersByUserId(Long userId) {
        return iOrderrepo.findByUserId(userId);
    }
}
