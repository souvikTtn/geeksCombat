package com.healthyMoves.healthyMoves.service;

import com.healthyMoves.healthyMoves.entity.Exercise;
import com.healthyMoves.healthyMoves.enums.ExerciseCategory;
import com.healthyMoves.healthyMoves.enums.ExerciseLevel;

import java.util.List;

public interface ExerciseService {
    long count();

    void save(List<Exercise> exercises);

    List<Exercise> getExercises(List<ExerciseCategory> categories, List<ExerciseLevel> levels);
}
