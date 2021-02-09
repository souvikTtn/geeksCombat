package com.healthyMoves.healthyMoves.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Coordinate {
    String x;
    String y;
    String z;
    String bodyPart;
}
