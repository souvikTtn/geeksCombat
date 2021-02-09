package com.healthyMoves.healthyMoves.entity;

import com.healthyMoves.healthyMoves.entity.audit.AuditModel;
import com.healthyMoves.healthyMoves.enums.BodyType;
import com.healthyMoves.healthyMoves.enums.ExerciseLevel;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Exercise extends AuditModel<String> {
    String name;
    ExerciseLevel level;
    Long caloriesBurn;
    TimePeriod period;
    List<BodyType> bodyTypes;
    String videoUrl;
    List<Coordinate> coordinates;
}
