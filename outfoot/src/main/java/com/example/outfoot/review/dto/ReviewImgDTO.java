package com.example.outfoot.review.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReviewImgDTO {
    private String reviewUuid;
    private String reviewFileName;
    private int reviewOrd;
    private Long rno;
}
