package com.example.restaurant.domain.Restaurant.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.web.bind.annotation.CookieValue;

import java.time.LocalDateTime;
@EntityListeners(AuditingEntityListener.class)
@Setter
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    private String name;
    private Category category;

    @CreatedDate
    @Column(updatable=false, nullable=false)
    private LocalDateTime createdAt;





}
