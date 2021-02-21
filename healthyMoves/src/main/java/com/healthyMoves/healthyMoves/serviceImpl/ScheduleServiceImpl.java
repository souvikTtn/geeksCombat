package com.healthyMoves.healthyMoves.serviceImpl;

import com.healthyMoves.healthyMoves.enums.ExerciseCategory;
import com.healthyMoves.healthyMoves.service.ScheduleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ScheduleServiceImpl implements ScheduleService {

    @Override
    public List<ExerciseCategory> getSchedule(int no) {
        List<ExerciseCategory> other = Arrays.stream(ExerciseCategory.values())
                                             .filter(it -> !it.equals(ExerciseCategory.FULL_BODY))
                                             .collect(Collectors.toList());
        Collections.shuffle(other);
        LinkedList<ExerciseCategory> categories = other.stream().limit(no-1)
                                                       .collect(Collectors.toCollection(LinkedList::new));
        categories.addFirst(ExerciseCategory.FULL_BODY);
        return categories;
    }
}
