package com.healthyMoves.healthyMoves.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TimePeriod {
    long reps;
    long sets;
    long time;
}
