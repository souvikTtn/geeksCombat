package com.healthyMoves.healthyMoves.serviceImpl;

import com.healthyMoves.healthyMoves.entity.BodyType;
import com.healthyMoves.healthyMoves.repository.BodyTypeRepository;
import com.healthyMoves.healthyMoves.service.BodyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BodyTypeServiceImpl implements BodyTypeService {
    @Autowired
    private BodyTypeRepository bodyTypeRepository;

    @Override
    public void save(BodyType bodyType) {
        bodyTypeRepository.save(bodyType);
    }

    @Override
    public List<BodyType> getAllBodyTypes() {
        return bodyTypeRepository.findAll();
    }

    @Override
    public long count() {
        return bodyTypeRepository.count();
    }

    @Override
    public BodyType findByType(com.healthyMoves.healthyMoves.enums.BodyType type) {
        return bodyTypeRepository.findByType(type);
    }
}
