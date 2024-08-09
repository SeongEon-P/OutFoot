package com.example.outfoot.notice.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Table(name = "notice_img")
public class NoticeImg {
    @Id
    private String noticeUuid;

    private String noticeFileName;
    private int noticeOrd;

    @ManyToOne
    @JoinColumn(name = "nno", nullable = false)
    private Notice notice;
}
