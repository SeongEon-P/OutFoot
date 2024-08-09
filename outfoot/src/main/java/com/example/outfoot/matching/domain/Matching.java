package com.example.outfoot.matching.domain;

import com.example.outfoot.teammanage.domain.TeamManage;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Table(name = "matching")
public class Matching {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

    private String mtitle;
    private String mcontent;
    private String mwriter;

    @Column(name = "reg_date", columnDefinition = "DATETIME(6)")
    private LocalDateTime reg_date;

    @Column(name = "mod_date", columnDefinition = "DATETIME(6)")
    private LocalDateTime mod_date;

    private int mviews;
    private String feeGuidUrl;
    private String placenm;
    private int uselimminnop;
    private int uselimmaxnop;
    private int revstddaynm;

    @ManyToOne
    @JoinColumn(name = "team_name", nullable = false)
    private TeamManage teamManage;

    @PrePersist
    public void prePersist() {
        if (reg_date == null) {
            reg_date = LocalDateTime.now();
        }
    }

    public void incrementViews() {
        this.mviews++;
    }

    public void updateDetails(String mtitle, String mcontent) {
        this.mtitle = mtitle;
        this.mcontent = mcontent;
    }
}
