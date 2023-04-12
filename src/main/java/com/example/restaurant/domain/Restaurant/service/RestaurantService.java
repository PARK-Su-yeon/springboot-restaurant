package com.example.restaurant.domain.Restaurant.service;

import com.example.restaurant.domain.Restaurant.dto.RestaurantResponse;
import com.example.restaurant.domain.Restaurant.dto.createRequest;
import com.example.restaurant.domain.Restaurant.dto.updateRequest;
import com.example.restaurant.domain.Restaurant.entity.Category;
import com.example.restaurant.domain.Restaurant.entity.Restaurant;
import com.example.restaurant.domain.Restaurant.repository.restaurantRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class RestaurantService {

    @Autowired
    private restaurantRepository restaurantRepository;

    public Restaurant create(createRequest restaurant) {
        Restaurant restaurant1 = restaurantRepository.save(Restaurant.builder()
                .name(restaurant.getName())
                .category(restaurant.getCategory())
                .build());
        return restaurant1;
    }

    @Transactional
    public Restaurant update(Long id, updateRequest updateRequest) {
        Restaurant restaurant1 = restaurantRepository.findById(id).get();
        log.info(String.valueOf(restaurant1.getCategory()));
        restaurant1.setCategory(updateRequest.getCategory());
        log.info(String.valueOf(restaurant1.getCategory()));


        return restaurant1;
    }

    @Transactional
    public List<Restaurant> getList() {
        List<Restaurant> restaurant1 = restaurantRepository.findAll();
        //log.info(String.valueOf(restaurant1.getCategory()));


        return restaurant1;
    }


    @Transactional
    public List<Restaurant> getCategoryList(Category category) {
        List<Restaurant> restaurant1 = restaurantRepository.findByCategory(category);
        //log.info(String.valueOf(restaurant1.getCategory()));


        return restaurant1;
    }

    @Transactional
    public Restaurant findId(Long id) {
        Restaurant restaurant1 = restaurantRepository.findId(id);
        //log.info(String.valueOf(restaurant1.getCategory()));


        return restaurant1;
    }

    public void delete(Long id) {

                restaurantRepository.deleteById(id);

    }
}
