package com.example.restaurant.domain.Restaurant.dto;

import com.example.restaurant.domain.Restaurant.entity.Category;
import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
@NoArgsConstructor
public class updateRequest {
    Category category;
}
