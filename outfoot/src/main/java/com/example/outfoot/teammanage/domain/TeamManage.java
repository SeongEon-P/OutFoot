package com.example.outfoot.teammanage.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Table(name = "team_manage")
public class TeamManage {
    @Id
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
