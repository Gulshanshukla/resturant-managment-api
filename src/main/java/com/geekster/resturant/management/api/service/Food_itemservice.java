package com.geekster.resturant.management.api.service;

import com.geekster.resturant.management.api.model.FoodItem;
import com.geekster.resturant.management.api.repo.IFooditemrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

public class Food_itemservice {
    @Autowired
  private  IFooditemrepo iFooditemrepo;


    public  void createFoodItem(FoodItem foodItem) {
        // Implement food item creation logic
   iFooditemrepo .save(foodItem);

    }

    public List<FoodItem> getAllFoodItems() {
        return iFooditemrepo.findAll();
    }
}
