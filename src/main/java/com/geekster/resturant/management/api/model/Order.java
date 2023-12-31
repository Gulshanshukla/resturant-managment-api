package com.geekster.resturant.management.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="UserOrder")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "food_item_id")
    private FoodItem foodItem;

    private int quantity;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String status; // CREATED, DISPATCHED, DELIVERED

    private LocalDateTime dateTime;
}
