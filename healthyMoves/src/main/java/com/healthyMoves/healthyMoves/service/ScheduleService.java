package com.healthyMoves.healthyMoves.service;

import com.healthyMoves.healthyMoves.dto.ScheduleDTO;

import java.util.List;

public interface ScheduleService {
    List<ScheduleDTO> getSchedule(int no);
}
