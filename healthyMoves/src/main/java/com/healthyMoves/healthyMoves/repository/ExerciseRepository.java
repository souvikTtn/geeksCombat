package com.healthyMoves.healthyMoves.repository;

import com.healthyMoves.healthyMoves.entity.Exercise;
import com.healthyMoves.healthyMoves.enums.ExerciseCategory;
import com.healthyMoves.healthyMoves.enums.ExerciseLevel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ExerciseRepository extends MongoRepository<Exercise, String> {
    @Query(value = "{deleted:false , active : true}", count = true)
    long count();

    List<Exercise> findByCategoriesInAndLevelIn(List<ExerciseCategory> categories, List<ExerciseLevel> levels);
}
