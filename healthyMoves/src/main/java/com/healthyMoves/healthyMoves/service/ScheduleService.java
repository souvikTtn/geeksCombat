package com.healthyMoves.healthyMoves.service;

import com.healthyMoves.healthyMoves.enums.ExerciseCategory;

import java.util.Map;

public interface ScheduleService {
    Map<String,ExerciseCategory> getSchedule(int no);
}
