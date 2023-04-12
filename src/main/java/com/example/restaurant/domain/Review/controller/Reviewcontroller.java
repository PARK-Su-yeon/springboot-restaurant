package com.example.restaurant.domain.Review.controller;


import com.example.restaurant.domain.Restaurant.entity.Category;
import com.example.restaurant.domain.Review.dto.ReviewResponse;
import com.example.restaurant.domain.Review.dto.createReviewRequest;
import com.example.restaurant.domain.Review.dto.mapper.ReviewMapper;
import com.example.restaurant.domain.Review.dto.updateReivewRequest;
import com.example.restaurant.domain.Review.entity.Review;
import com.example.restaurant.domain.Review.service.ReviewService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//
@Slf4j
@RequestMapping("/review")
@RestController
@RequiredArgsConstructor
public class Reviewcontroller {
    private final ReviewService reviewService;
//    private final ReviewMapper mapper;

    @PostMapping("/")
    public ResponseEntity<Review> create(@Valid @RequestBody createReviewRequest createRequest) {

        //  Restaurant restaurant=  restaurantservice.create(createRequest);
        // return restaurant;
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(reviewService.create(createRequest));
    }


    @PutMapping("/{id}")
    public ResponseEntity<Review> update(@PathVariable Long id, @RequestBody updateReivewRequest updateRequest) {

        Review review= reviewService.update(id,updateRequest);
        //log.info(String.valueOf(review.getCategory()));
        // return restaurant;
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(review);


    }

    @GetMapping("/list")
    public ResponseEntity<List<Review>> getList() {

        List<Review> restaurant= reviewService.getList();
        // return restaurant;
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(restaurant);


    }

    @GetMapping("/{id}")
    public ResponseEntity<Review> getId(@PathVariable Long id) {

        Review restaurant= reviewService.findId(id);
        // return restaurant;
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(restaurant);


    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        reviewService.delete(id);

        return null;
    }
}