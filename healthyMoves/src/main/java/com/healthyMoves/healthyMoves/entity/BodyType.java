package com.healthyMoves.healthyMoves.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class BodyType {
    String image;
    String description;
    BodyType type;
}
