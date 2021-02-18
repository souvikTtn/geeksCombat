package com.healthyMoves.healthyMoves.serviceImpl;

import com.healthyMoves.healthyMoves.enums.ExerciseLevel;
import com.healthyMoves.healthyMoves.service.ExerciseLevelService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ExerciseLevelServiceImpl implements ExerciseLevelService {
    @Override
    public List<ExerciseLevel> getAll() {
        return Arrays.asList(ExerciseLevel.values());
    }
}
