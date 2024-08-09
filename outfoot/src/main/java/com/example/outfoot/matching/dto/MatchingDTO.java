package com.example.outfoot.matching.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MatchingDTO {
    private Long mno;
    private String mtitle;
    private String mcontent;
    private String mwriter;
    private LocalDateTime reg_date;
    private LocalDateTime mod_date;
    private int mviews;
    private String feeGuidUrl;
    private String placenm;
    private int uselimminnop;
    private int uselimmaxnop;
    private int revstddaynm;
    private String teamName;
}
