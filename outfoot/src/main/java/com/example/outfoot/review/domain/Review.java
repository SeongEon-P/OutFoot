package com.example.outfoot.review.domain;

import com.example.outfoot.member.domain.Member;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;

    private String reviewTitle;
    private String reviewExp;

    @ManyToOne
    @JoinColumn(name = "mid", nullable = false)
    private Member member;

    @Column(name = "reg_date", columnDefinition = "DATETIME(6)")
    private LocalDateTime reg_date;

    @Column(name = "mod_date", columnDefinition = "DATETIME(6)")
    private LocalDateTime mod_date;

    private int rviews;

    @PrePersist
    public void prePersist() {
        if (reg_date == null) {
            reg_date = LocalDateTime.now();
        }
    }

    public void incrementViews() {
        this.rviews++;
    }

    public void updateDetails(String reviewTitle, String reviewExp) {
        this.reviewTitle = reviewTitle;
        this.reviewExp = reviewExp;
    }
}
