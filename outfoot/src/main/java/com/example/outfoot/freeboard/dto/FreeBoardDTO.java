package com.example.outfoot.freeboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FreeBoardDTO {
    private Long bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private LocalDateTime reg_date;
    private int bviews;
}
