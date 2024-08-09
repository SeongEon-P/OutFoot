package com.example.outfoot.teamincruit.service;

import com.example.outfoot.teamincruit.domain.Incruit;
import com.example.outfoot.teamincruit.dto.IncruitDTO;
import com.example.outfoot.teamincruit.repository.IncruitRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@Service
@RequiredArgsConstructor
public class IncruitServiceImpl implements IncruitService {
    private IncruitRepository incruitRepository;

    @Override
    public List<IncruitDTO> getAllIncruit() {
        List<Incruit> incruits = incruitRepository.findAll();
        return incruits.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private IncruitDTO convertToDto(Incruit incruit) {
        return IncruitDTO.builder()
                .ino(incruit.getIno())
                .icontent(incruit.getIcontent())
                .ititle(incruit.getItitle())
                .iwriter(incruit.getIwriter())
                .regDate(incruit.getRegDate())
                .iviews(incruit.getIviews())
                .teamName(incruit.getTeam().getTeamName())
                .teamMemberCount(incruit.getTeamMemberCount())
                .teamStartdate(incruit.getTeamStartdate())
                .teamExplain(incruit.getTeamExplain())
                .teamLeader(incruit.getTeamLeader())
                .teamLogo(incruit.getTeamLogo())
                .teamLevel(incruit.getTeamLevel())
                .teamFromPro(incruit.getTeamFromPro())
                .build();
    }

}
