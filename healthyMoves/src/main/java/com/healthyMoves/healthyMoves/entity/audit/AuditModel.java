package com.healthyMoves.healthyMoves.entity.audit;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.Date;

@Data
public abstract class AuditModel<K> implements Serializable {
    @EqualsAndHashCode.Include
    @Id
    K id;

    @CreatedDate
    Date createdDate = new Date();

    @LastModifiedDate
    Date modifiedDate = new Date();

    boolean active = true;

    boolean deleted = false;
}
