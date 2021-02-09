package com.healthyMoves.healthyMoves.entity;

import com.healthyMoves.healthyMoves.entity.audit.AuditModel;
import com.healthyMoves.healthyMoves.enums.AuthProvider;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends AuditModel<String> {
    String email;
    String socialId;
    AuthProvider provider;
    String token;
    //in kgs
    Long weight;
    //in cms
    Long height;
}
