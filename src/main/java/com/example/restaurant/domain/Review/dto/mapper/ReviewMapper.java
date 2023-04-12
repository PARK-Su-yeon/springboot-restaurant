package com.example.restaurant.domain.Review.dto.mapper;

import com.example.restaurant.domain.Review.dto.ReviewResponse;
import com.example.restaurant.domain.Review.entity.Review;

public class ReviewMapper {
    public ReviewResponse toResponseDto(Review entity) {
        return ReviewResponse.builder()
                .title(entity.getTitle()) // PostId
                .content(entity.getContent())
                .build();
    }

}
