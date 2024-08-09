package com.example.outfoot.teammanage.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeamManageImgDTO {
    private String teamManageUuid;
    private String teamManageFileName;
    private int teamManageOrd;
    private String teamName;
}
