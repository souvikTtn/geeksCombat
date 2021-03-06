package com.healthyMoves.healthyMoves.entity;

import com.healthyMoves.healthyMoves.entity.audit.AuditModel;
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
public class Schedule extends AuditModel<String> {
    String userId;
    List<Exercise> exercises;
}
