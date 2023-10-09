package com.geekster.resturant.management.api.repo;

import com.geekster.resturant.management.api.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface IOrderrepo extends JpaRepository<Order, Long> {
    List<Order> findByUserId(Long userId);
}
