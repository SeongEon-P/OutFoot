package com.example.outfoot.freeboard.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Table(name = "free_board")
public class FreeBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    private String btitle;
    private String bcontent;
    private String bwriter;

    @Column(name = "reg_date", columnDefinition = "DATETIME(6)")
    private LocalDateTime reg_date;

    private int bviews;

    @PrePersist
    public void prePersist() {
        if (reg_date == null) {
            reg_date = LocalDateTime.now();
        }
    }

    public void incrementViews() {
        this.bviews++;
    }

    public void updateDetails(String btitle, String bcontent) {
        this.btitle = btitle;
        this.bcontent = bcontent;
    }
}
