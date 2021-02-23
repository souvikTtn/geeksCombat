package com.healthyMoves.healthyMoves.dto;

import com.healthyMoves.healthyMoves.enums.ExerciseCategory;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ScheduleDTO {
    String day;
    ExerciseCategory category;
}
