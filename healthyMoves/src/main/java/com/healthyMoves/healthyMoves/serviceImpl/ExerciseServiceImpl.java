package com.healthyMoves.healthyMoves.serviceImpl;

import com.healthyMoves.healthyMoves.entity.Exercise;
import com.healthyMoves.healthyMoves.enums.ExerciseCategory;
import com.healthyMoves.healthyMoves.enums.ExerciseLevel;
import com.healthyMoves.healthyMoves.repository.ExerciseRepository;
import com.healthyMoves.healthyMoves.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Override
    public long count() {
        return exerciseRepository.count();
    }

    @Override
    public void save(List<Exercise> exercises) {
        exerciseRepository.saveAll(exercises);
    }

    @Override
    public List<Exercise> getExercises(List<ExerciseCategory> categories, List<ExerciseLevel> levels) {
        if (categories.contains(ExerciseCategory.FULL_BODY)) {
            List<Exercise> exercises = exerciseRepository.findAll();
            Collections.shuffle(exercises);
            return exercises.stream().limit(12).collect(Collectors.toList());
        }

        return exerciseRepository.findByCategoriesInAndLevelIn(categories, levels);
    }
}
