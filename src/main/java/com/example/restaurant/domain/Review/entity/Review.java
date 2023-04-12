package com.example.restaurant.domain.Review.entity;

import com.example.restaurant.domain.Restaurant.entity.Category;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
@EntityListeners(AuditingEntityListener.class)
@Setter
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;
    @Column
    private String title;
    @Column
    private String content;

    @CreatedDate
    @Column(updatable=false, nullable=false)
    private LocalDateTime createdAt;





}
