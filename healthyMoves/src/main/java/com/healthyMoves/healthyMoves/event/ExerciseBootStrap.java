package com.healthyMoves.healthyMoves.event;


import com.healthyMoves.healthyMoves.entity.Exercise;
import com.healthyMoves.healthyMoves.enums.ExerciseCategory;
import com.healthyMoves.healthyMoves.enums.ExerciseLevel;
import com.healthyMoves.healthyMoves.service.ExerciseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
public class ExerciseBootStrap {

    @Autowired
    private ExerciseService exerciseService;


    @EventListener(ContextRefreshedEvent.class)
    public void setUpExercise() {
        log.info("Setting up exercises");
        if (exerciseService.count() == 0) {
            List<Exercise> exercises = new ArrayList<>();


            //Chest Exercise
            Exercise jumpingJacks = new Exercise();
            jumpingJacks.setName("Jumping Jacks");
            jumpingJacks
                    .setCategories(Arrays.asList(ExerciseCategory.CHEST, ExerciseCategory.ARMS, ExerciseCategory.LEGS
                            , ExerciseCategory.SHOULDER_AND_BACK));
            jumpingJacks
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(jumpingJacks);

            Exercise inclinePushUp = new Exercise();
            inclinePushUp.setName("InclinePushUp");
            inclinePushUp.setCategories(Arrays.asList(ExerciseCategory.CHEST));
            inclinePushUp
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(inclinePushUp);

            Exercise kneePushUp = new Exercise();
            kneePushUp.setName("kneePushUp");
            kneePushUp.setCategories(Arrays.asList(ExerciseCategory.CHEST, ExerciseCategory.SHOULDER_AND_BACK));
            kneePushUp
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(kneePushUp);

            Exercise pushUp = new Exercise();
            pushUp.setName("push up");
            pushUp.setCategories(Arrays.asList(ExerciseCategory.CHEST, ExerciseCategory.ARMS));
            pushUp.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(pushUp);

            Exercise wideArmPushUp = new Exercise();
            wideArmPushUp.setName("wideArm Push Up ");
            wideArmPushUp.setCategories(Arrays.asList(ExerciseCategory.CHEST));
            wideArmPushUp
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(wideArmPushUp);

            Exercise cobraStretch = new Exercise();
            cobraStretch.setName("cobraStretch");
            cobraStretch.setCategories(Arrays.asList(ExerciseCategory.CHEST));
            cobraStretch
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(cobraStretch);

            Exercise chestStretch = new Exercise();
            chestStretch.setName("chestStretch");
            chestStretch.setCategories(Arrays.asList(ExerciseCategory.CHEST));
            chestStretch
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(chestStretch);

            Exercise tricepsDips = new Exercise();
            tricepsDips.setName("Triceps Dips");
            tricepsDips.setCategories(
                    Arrays.asList(ExerciseCategory.CHEST, ExerciseCategory.ARMS, ExerciseCategory.SHOULDER_AND_BACK));
            tricepsDips
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(tricepsDips);

            //arms exercise
            Exercise armRaise = new Exercise();
            armRaise.setName("Arm raise");
            armRaise.setCategories(Arrays.asList(ExerciseCategory.ARMS, ExerciseCategory.SHOULDER_AND_BACK));
            armRaise.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(armRaise);

            Exercise sideArmRaise = new Exercise();
            sideArmRaise.setName("Side Arm raise");
            sideArmRaise.setCategories(Arrays.asList(ExerciseCategory.ARMS, ExerciseCategory.SHOULDER_AND_BACK));
            sideArmRaise
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(sideArmRaise);

            Exercise armCircleClockWise = new Exercise();
            armCircleClockWise.setName("Arm circle clockwise");
            armCircleClockWise.setCategories(Arrays.asList(ExerciseCategory.ARMS));
            armCircleClockWise
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(armCircleClockWise);

            Exercise armCircleCounterClockWise = new Exercise();
            armCircleCounterClockWise.setName("Arm circle counter clockwise");
            armCircleCounterClockWise.setCategories(Arrays.asList(ExerciseCategory.ARMS));
            armCircleCounterClockWise
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(armCircleCounterClockWise);

            Exercise diamondPushUp = new Exercise();
            diamondPushUp.setName("Diamond Push up");
            diamondPushUp.setCategories(Arrays.asList(ExerciseCategory.ARMS));
            diamondPushUp
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(diamondPushUp);

            Exercise punches = new Exercise();
            punches.setName("Punches");
            punches.setCategories(Arrays.asList(ExerciseCategory.ARMS));
            punches.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(punches);

            //legs
            Exercise squats = new Exercise();
            squats.setName("Squats");
            squats.setCategories(Arrays.asList(ExerciseCategory.LEGS));
            squats.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(squats);

            Exercise sideHops = new Exercise();
            sideHops.setName("Side Hops");
            sideHops.setCategories(Arrays.asList(ExerciseCategory.LEGS));
            sideHops.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(sideHops);

            Exercise lunges = new Exercise();
            lunges.setName("Lunges");
            lunges.setCategories(Arrays.asList(ExerciseCategory.LEGS));
            lunges.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(lunges);

            Exercise calfRaise = new Exercise();
            calfRaise.setName("Calf Raise");
            calfRaise.setCategories(Arrays.asList(ExerciseCategory.LEGS));
            calfRaise.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(calfRaise);

            Exercise calfStretchLeft = new Exercise();
            calfStretchLeft.setName("Calf Stretch Left");
            calfStretchLeft.setCategories(Arrays.asList(ExerciseCategory.LEGS));
            calfStretchLeft
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(calfStretchLeft);

            Exercise calfStretchRight = new Exercise();
            calfStretchRight.setName("Calf Stretch Right");
            calfStretchRight.setCategories(Arrays.asList(ExerciseCategory.LEGS));
            calfStretchRight
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            exercises.add(calfStretchRight);
            exerciseService.save(exercises);
        }


    }
}
