package com.example.outfoot.member.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Table(name = "member")
public class Member {
    @Id
    private String mid;

    private String mpw;
    private String name;
    private String email;
    private String address;
    private String phone;

    @Column(name = "regdate", columnDefinition = "DATETIME(6)")
    private LocalDateTime regdate;

    private String role;

    @PrePersist
    public void prePersist() {
        if (regdate == null) {
            regdate = LocalDateTime.now();
        }
    }
}
