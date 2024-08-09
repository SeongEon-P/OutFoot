package com.example.outfoot.review.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDTO {
    private Long rno;
    private String reviewTitle;
    private String reviewExp;
    private String mid;
    private LocalDateTime reg_date;
    private LocalDateTime mod_date;
    private int rviews;
}
