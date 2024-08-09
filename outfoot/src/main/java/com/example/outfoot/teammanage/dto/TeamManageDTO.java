package com.example.outfoot.teammanage.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeamManageDTO {
    private String teamName;
    private int teamMemberCount;
    private String teamMembers;
    private LocalDate teamStartdate;
    private String teamLeader;
    private String teamLogo;
    private String teamExplain;
    private Long teamFromPro;
    private int teamLevel;
}
