package com.example.restaurant.domain.Restaurant.dto;

import com.example.restaurant.domain.Restaurant.entity.Category;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder

public class RestaurantResponse {

    private String name;
    private Category category;
    private LocalDateTime createdAt;

}
