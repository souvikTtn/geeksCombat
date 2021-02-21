package com.healthyMoves.healthyMoves.service;

import com.healthyMoves.healthyMoves.enums.ExerciseCategory;

import java.util.List;

public interface ScheduleService {
    List<ExerciseCategory> getSchedule(int no);
}
