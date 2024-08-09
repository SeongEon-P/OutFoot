package com.example.outfoot.teammanage.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Table(name = "team_manage_img")
public class TeamManageImg {
    @Id
    private String teamManageUuid;

    private String teamManageFileName;
    private int teamManageOrd;

    @ManyToOne
    @JoinColumn(name = "team_name", nullable = false)
    private TeamManage teamManage;
}
