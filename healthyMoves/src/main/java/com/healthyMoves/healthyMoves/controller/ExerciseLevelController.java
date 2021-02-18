package com.healthyMoves.healthyMoves.controller;

import com.healthyMoves.healthyMoves.constant.ApplicationConstant;
import com.healthyMoves.healthyMoves.dto.ResponseDTO;
import com.healthyMoves.healthyMoves.enums.ExerciseLevel;
import com.healthyMoves.healthyMoves.service.ExerciseLevelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = ApplicationConstant.V2_EXERCISE_LEVEL)
public class ExerciseLevelController {
    @Autowired
    private ExerciseLevelService exerciseLevelService;

    @GetMapping
    public ResponseDTO<List<ExerciseLevel>> getAll() {
        log.info("request received for getting all exercise levels");
        return new ResponseDTO<>(true, "exercise level fetched successfully", exerciseLevelService.getAll());
    }
}
