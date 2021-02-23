package com.healthyMoves.healthyMoves.serviceImpl;

import com.healthyMoves.healthyMoves.dto.ScheduleDTO;
import com.healthyMoves.healthyMoves.enums.ExerciseCategory;
import com.healthyMoves.healthyMoves.service.ScheduleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ScheduleServiceImpl implements ScheduleService {

    @Override
    public List<ScheduleDTO> getSchedule(int no) {
        List<ScheduleDTO> schedule = new ArrayList<>();
        List<String> weekDays = Arrays
                .asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday");


        List<ExerciseCategory> other = Arrays.stream(ExerciseCategory.values())
                                             .filter(it -> !it.equals(ExerciseCategory.FULL_BODY) &&
                                                           !it.equals(ExerciseCategory.REST_DAY))
                                             .collect(Collectors.toList());
        Collections.shuffle(other);
        List<ExerciseCategory> categories = new ArrayList<>();
        categories.add(ExerciseCategory.FULL_BODY);
        categories.addAll(other.stream().limit(no - 1L).collect(Collectors.toList()));
        categories.forEach(cat -> {
            ScheduleDTO scheduleDTO = ScheduleDTO.builder().build();
            scheduleDTO.setDay(weekDays.get(categories.indexOf(cat)));
            scheduleDTO.setCategory(cat);
            schedule.add(scheduleDTO);
        });

        schedule.addAll(Arrays.asList(
                ScheduleDTO.builder().category(ExerciseCategory.REST_DAY).day("Saturday").build(),
                ScheduleDTO.builder().category(ExerciseCategory.REST_DAY).day("Saturday").build()
        ));
        return schedule;

    }
}
