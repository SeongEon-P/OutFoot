package com.example.outfoot.notice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NoticeImgDTO {
    private String noticeUuid;
    private String noticeFileName;
    private int noticeOrd;
    private Long nno;
}
