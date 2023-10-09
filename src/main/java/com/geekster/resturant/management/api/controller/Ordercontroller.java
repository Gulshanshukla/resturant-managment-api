package com.geekster.resturant.management.api.controller;

import com.geekster.resturant.management.api.model.Order;
import com.geekster.resturant.management.api.service.Orderservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/api/orders")
public class Ordercontroller {
    @Autowired
  private  Orderservice orderservice;
    @PostMapping("/place")
    public String placeOrder(@RequestBody Order order) {
        orderservice.placeOrder(order);
        return "Order placed successfully";
    }
    @GetMapping("/list/{userId}")
    public List<Order> getAllOrdersByUserId(@PathVariable Long userId) {
        return orderservice.getAllOrdersByUserId(userId);
    }

}
