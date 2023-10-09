package com.geekster.resturant.management.api.controller;

import com.geekster.resturant.management.api.model.FoodItem;
import com.geekster.resturant.management.api.service.Food_itemservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/api/fooditems")

public class Food_itemcontroller {
    @Autowired
    private Food_itemservice foodItemservice;
    @PostMapping("/create")
    public String createFoodItem(@RequestBody FoodItem foodItem) {
        foodItemservice.createFoodItem(foodItem);
        return "Food item created successfully";
    }
    @GetMapping("/list")
    public List<FoodItem> getAllFoodItems() {
        return foodItemservice.getAllFoodItems();
    }

}
