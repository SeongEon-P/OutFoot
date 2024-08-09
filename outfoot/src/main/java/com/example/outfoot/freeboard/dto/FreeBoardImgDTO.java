package com.example.outfoot.freeboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FreeBoardImgDTO {
    private String freeBoardUuid;
    private String freeBoardFileName;
    private int freeBoardOrd;
    private Long bno;
}
