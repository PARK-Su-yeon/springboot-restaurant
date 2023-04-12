package com.example.restaurant.domain.Review.dto;

import com.example.restaurant.domain.Restaurant.entity.Category;
import com.example.restaurant.domain.Review.entity.Review;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewResponse {

    private String title;
    private String content;


    public ReviewResponse(Review review) {
        this.title= review.getTitle();
        this.content=review.getContent();
    }
}
