package com.example.restaurant.domain.Review.dto;

import com.example.restaurant.domain.Restaurant.entity.Category;
import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
@NoArgsConstructor
public class updateReivewRequest {
    String content;
    String title;
}
