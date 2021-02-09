package com.healthyMoves.healthyMoves.entity;

import com.healthyMoves.healthyMoves.entity.audit.AuditModel;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Document
public class BodyType extends AuditModel<String> {
    String image;
    String description;
    BodyType type;
}
