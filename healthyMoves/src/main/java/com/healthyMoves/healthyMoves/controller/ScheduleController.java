package com.healthyMoves.healthyMoves.controller;

import com.healthyMoves.healthyMoves.constant.ApplicationConstant;
import com.healthyMoves.healthyMoves.dto.ResponseDTO;
import com.healthyMoves.healthyMoves.enums.ExerciseCategory;
import com.healthyMoves.healthyMoves.service.ScheduleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = ApplicationConstant.V2_SCHEDULE)
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping
    public ResponseDTO<List<ExerciseCategory>> getSchedule(@RequestParam("no") int no) {
        log.info("request received for retreiving schedule");
        return new ResponseDTO<>(true, "Schedule fetched successfull", scheduleService.getSchedule(no));
    }
}
