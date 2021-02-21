package com.healthyMoves.healthyMoves.controller;

import com.healthyMoves.healthyMoves.command.ExerciseCO;
import com.healthyMoves.healthyMoves.constant.ApplicationConstant;
import com.healthyMoves.healthyMoves.dto.ResponseDTO;
import com.healthyMoves.healthyMoves.entity.Exercise;
import com.healthyMoves.healthyMoves.service.ExerciseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = ApplicationConstant.V2_EXERCISE)
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @PostMapping
    public ResponseDTO<List<Exercise>> getExercises(@RequestBody ExerciseCO exerciseCO) {
        log.info("request received for getting exercise");
        return new ResponseDTO<>(true, "fetched exercise successfully",
                                 exerciseService.getExercises(Collections.singletonList(exerciseCO.getCategory()),
                                                              Collections.singletonList(exerciseCO.getLevel())));
    }
}
