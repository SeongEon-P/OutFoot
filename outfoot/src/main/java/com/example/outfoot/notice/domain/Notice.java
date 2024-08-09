package com.example.outfoot.notice.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Table(name = "notice")
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    private String title;

    @Column(name = "reg_date", columnDefinition = "DATE")
    private LocalDate reg_date;

    private String writer;
    private String content;

    private int views;

    @PrePersist
    public void prePersist() {
        if (reg_date == null) {
            reg_date = LocalDate.now();
        }
    }

    public void incrementViews() {
        this.views++;
    }

    public void updateDetails(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
