package com.geekster.resturant.management.api.repo;

import com.geekster.resturant.management.api.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IFooditemrepo extends JpaRepository<FoodItem, Long> {
}
