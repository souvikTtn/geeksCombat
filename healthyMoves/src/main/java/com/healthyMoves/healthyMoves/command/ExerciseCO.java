package com.healthyMoves.healthyMoves.command;

import com.healthyMoves.healthyMoves.enums.ExerciseCategory;
import com.healthyMoves.healthyMoves.enums.ExerciseLevel;
import lombok.Data;

@Data
public class ExerciseCO {
    ExerciseLevel level;
    ExerciseCategory category;
}
