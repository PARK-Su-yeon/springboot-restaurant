package com.example.restaurant.domain.Restaurant.repository;

import com.example.restaurant.domain.Restaurant.dto.RestaurantResponse;
import com.example.restaurant.domain.Restaurant.entity.Category;
import com.example.restaurant.domain.Restaurant.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface restaurantRepository extends JpaRepository <Restaurant,Long >{
    @Query("SELECT u FROM restaurant  u WHERE u.category=:category")
    List<Restaurant> findByCategory(@Param("category") Category category);

    @Query("SELECT u FROM restaurant  u WHERE u.id=:id")
    Restaurant findId(@Param("id") Long id);
}
