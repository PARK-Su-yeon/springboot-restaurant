package com.example.restaurant.domain.Review.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class createReviewRequest {

    private String name;
    private String title;
    private String content;
    
}

