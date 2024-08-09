package com.example.outfoot.review.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Table(name = "review_img")
public class ReviewImg {
    @Id
    private String reviewUuid;

    private String reviewFileName;
    private int reviewOrd;

    @ManyToOne
    @JoinColumn(name = "rno", nullable = false)
    private Review review;
}
