package com.example.restaurant.domain.Review.service;

import com.example.restaurant.domain.Review.dto.createReviewRequest;
import com.example.restaurant.domain.Review.dto.updateReivewRequest;
import com.example.restaurant.domain.Review.entity.Review;
import com.example.restaurant.domain.Review.repository.ReviewRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public Review create(createReviewRequest createRequest) {
        Review review = reviewRepository.save(Review.builder()
                .name(createRequest.getName())
                .title(createRequest.getTitle())
                .content(createRequest.getContent())
                .build());
        return review;

    }

    @Transactional
    public Review update(Long id, updateReivewRequest updateRequest) {
        Review review  = reviewRepository.findById(id).get();

        review.setContent(updateRequest.getContent());
        review.setTitle(updateRequest.getTitle());


        return review;
    }

    @Transactional
    public List<Review> getList() {
        List<Review> review = reviewRepository.findAllCreate();
        //log.info(String.valueOf(restaurant1.getCategory()));
        return review;
    }

//
//    @Transactional
//    public List<Review> getCategoryList(Category category) {
//        List<Review> review = reviewRepository.findByCategory(category);
//        //log.info(String.valueOf(restaurant1.getCategory()));
//
//
//        return review;
//    }
//
    @Transactional
    public Review findId(Long id) {
        Review review  = reviewRepository.findId(id);
        //log.info(String.valueOf(restaurant1.getCategory()));
        return review;
    }

    public void delete(Long id) {

        reviewRepository.deleteById(id);

    }
}
