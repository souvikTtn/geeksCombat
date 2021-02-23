package com.healthyMoves.healthyMoves.serviceImpl;

import com.healthyMoves.healthyMoves.enums.ExerciseCategory;
import com.healthyMoves.healthyMoves.service.ScheduleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ScheduleServiceImpl implements ScheduleService {

    @Override
    public Map<String, ExerciseCategory> getSchedule(int no) {
        List<String> weekDays = Arrays
                .asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");


        List<ExerciseCategory> other = Arrays.stream(ExerciseCategory.values())
                                             .filter(it -> !it.equals(ExerciseCategory.FULL_BODY) && !it.equals(ExerciseCategory.REST_DAY))
                                             .collect(Collectors.toList());
        Collections.shuffle(other);
        List<ExerciseCategory> categories = new ArrayList<>();
        categories.add(ExerciseCategory.FULL_BODY);
        categories.addAll(other.stream().limit(no - 1L).collect(Collectors.toList()));
        Map<String, ExerciseCategory> response = new LinkedHashMap<>();
        categories.forEach(cat -> {
            response.put(weekDays.get(categories.indexOf(cat)), cat);
        });




        weekDays.forEach(day ->{
            if(!response.keySet().contains(day)){
                response.put(day,ExerciseCategory.REST_DAY);
            }
        });
        return response;
    }
}
