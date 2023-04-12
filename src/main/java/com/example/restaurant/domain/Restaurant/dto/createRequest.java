package com.example.restaurant.domain.Restaurant.dto;

import com.example.restaurant.domain.Restaurant.entity.Category;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Builder

public class createRequest {

    private String name;
    private Category category;

}

