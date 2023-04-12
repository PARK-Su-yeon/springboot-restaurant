package com.example.restaurant.domain.Restaurant.controller;


import com.example.restaurant.domain.Restaurant.dto.RestaurantResponse;
import com.example.restaurant.domain.Restaurant.dto.createRequest;
import com.example.restaurant.domain.Restaurant.dto.updateRequest;
import com.example.restaurant.domain.Restaurant.entity.Category;
import com.example.restaurant.domain.Restaurant.entity.Restaurant;
import com.example.restaurant.domain.Restaurant.service.RestaurantService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/restaurant")
@RestController
@RequiredArgsConstructor
public class Restaurantcontroller {
    private final RestaurantService restaurantservice;

    @PostMapping("/")
    public ResponseEntity<Restaurant> create(@Valid @RequestBody createRequest createRequest) {

      //  Restaurant restaurant=  restaurantservice.create(createRequest);
       // return restaurant;
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(restaurantservice.create(createRequest));


    }
    @PutMapping("/{id}")
    public ResponseEntity<Restaurant> update( @PathVariable Long id, @RequestBody updateRequest updateRequest) {

        Restaurant restaurant= restaurantservice.update(id,updateRequest);
        log.info(String.valueOf(restaurant.getCategory()));
        // return restaurant;
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(restaurant);


    }

    @GetMapping("/list")
    public ResponseEntity<List<Restaurant>> getList() {

        List<Restaurant> restaurant= restaurantservice.getList();
        // return restaurant;
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(restaurant);


    }
    @GetMapping("/list/{category}")
    public ResponseEntity<List<Restaurant>> getCategoryList(@PathVariable Category category) {

        List<Restaurant> restaurant= restaurantservice.getCategoryList(category);
        // return restaurant;
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(restaurant);


    }

    @GetMapping("/{id}")
    public ResponseEntity<Restaurant> getId(@PathVariable Long id) {

        Restaurant restaurant= restaurantservice.findId(id);
        // return restaurant;
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(restaurant);


    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        restaurantservice.delete(id);
        return ResponseEntity.noContent().build();
    }
}
