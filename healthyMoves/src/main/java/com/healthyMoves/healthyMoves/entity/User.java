package com.healthyMoves.healthyMoves.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.healthyMoves.healthyMoves.entity.audit.AuditModel;
import com.healthyMoves.healthyMoves.enums.AuthProvider;
import com.healthyMoves.healthyMoves.enums.ExerciseLevel;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends AuditModel<String> {
    @Indexed(unique = true)
    String email;
    @JsonIgnore
    String socialId;
    AuthProvider provider;
    String token;
    //in kgs
    Long weight;
    //in cms
    Long height;
    ExerciseLevel level;
}
