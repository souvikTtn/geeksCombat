package com.healthyMoves.healthyMoves.entity;

import com.healthyMoves.healthyMoves.entity.audit.AuditModel;
import com.healthyMoves.healthyMoves.enums.AuthProvider;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class User extends AuditModel<String> {
    String email;
    String socialId;
    AuthProvider provider;
    String token;
}
