package com.healthyMoves.healthyMoves.repository;

import com.healthyMoves.healthyMoves.entity.BodyType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface BodyTypeRepository extends MongoRepository<BodyType, String> {

    @Query(value = "{deleted:false , active : true}", count = true)
    long count();

    BodyType findByType(com.healthyMoves.healthyMoves.enums.BodyType type);
}
