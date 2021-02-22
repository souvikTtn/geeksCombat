package com.healthyMoves.healthyMoves.service;

import com.healthyMoves.healthyMoves.entity.BodyType;

import java.util.List;

public interface BodyTypeService {
    void save(BodyType bodyType);
    List<BodyType> getAllBodyTypes();
    long count();
    BodyType findByType(com.healthyMoves.healthyMoves.enums.BodyType type);
}
