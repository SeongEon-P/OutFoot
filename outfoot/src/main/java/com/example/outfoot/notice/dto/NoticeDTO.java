package com.example.outfoot.notice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NoticeDTO {
    private Long bno;
    private String title;
    private String content;
    private String writer;
    private LocalDate reg_date;
    private int views;
}
