package com.example.outfoot.freeboard.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Table(name = "free_board_img")
public class FreeBoardImg {
    @Id
    private String freeBoardUuid;

    private String freeBoardFileName;
    private int freeBoardOrd;

    @ManyToOne
    @JoinColumn(name = "bno", nullable = false)
    private FreeBoard freeBoard;
}
