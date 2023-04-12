package com.example.restaurant.domain.Review.repository;

import com.example.restaurant.domain.Restaurant.entity.Category;
import com.example.restaurant.domain.Restaurant.entity.Restaurant;
import com.example.restaurant.domain.Review.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository <Review,Long >{
    @Query("SELECT u FROM Review  u ORDER BY u.createdAt DESC ")
    List<Review> findAllCreate();

    @Query("SELECT u FROM Review  u WHERE u.id=:id")
    Review findId(@Param("id") Long id);
}
