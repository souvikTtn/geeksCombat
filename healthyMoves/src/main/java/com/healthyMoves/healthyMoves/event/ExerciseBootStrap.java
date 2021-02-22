package com.healthyMoves.healthyMoves.event;


import com.healthyMoves.healthyMoves.entity.Exercise;
import com.healthyMoves.healthyMoves.entity.TimePeriod;
import com.healthyMoves.healthyMoves.enums.ExerciseCategory;
import com.healthyMoves.healthyMoves.enums.ExerciseLevel;
import com.healthyMoves.healthyMoves.service.ExerciseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${base.path.logos}")
    private String logoUrl;

    @Value("${base.path.videos}")
    private String videoUrl;

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
            TimePeriod timePeriod = new TimePeriod();
            timePeriod.setReps(10);
            timePeriod.setSets(3);
            timePeriod.setTime(10);
            jumpingJacks.setPeriod(timePeriod);
            jumpingJacks.setLogoUrl(logoUrl + "/jumpingJack.jpg");
            jumpingJacks.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(jumpingJacks);

            Exercise inclinePushUp = new Exercise();
            inclinePushUp.setName("InclinePushUp");
            inclinePushUp.setCategories(Arrays.asList(ExerciseCategory.CHEST));
            inclinePushUp
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            inclinePushUp.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(inclinePushUp);

            Exercise kneePushUp = new Exercise();
            kneePushUp.setName("kneePushUp");
            kneePushUp.setCategories(Arrays.asList(ExerciseCategory.CHEST, ExerciseCategory.SHOULDER_AND_BACK));
            kneePushUp
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            kneePushUp.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(kneePushUp);

            Exercise pushUp = new Exercise();
            pushUp.setName("push up");
            pushUp.setCategories(Arrays.asList(ExerciseCategory.CHEST, ExerciseCategory.ARMS));
            pushUp.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            pushUp.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(pushUp);

            Exercise wideArmPushUp = new Exercise();
            wideArmPushUp.setName("wideArm Push Up ");
            wideArmPushUp.setCategories(Arrays.asList(ExerciseCategory.CHEST));
            wideArmPushUp
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            wideArmPushUp.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(wideArmPushUp);

            Exercise cobraStretch = new Exercise();
            cobraStretch.setName("cobraStretch");
            cobraStretch.setCategories(Arrays.asList(ExerciseCategory.CHEST));
            cobraStretch
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            cobraStretch.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(cobraStretch);

            Exercise chestStretch = new Exercise();
            chestStretch.setName("chestStretch");
            chestStretch.setCategories(Arrays.asList(ExerciseCategory.CHEST));
            chestStretch
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            chestStretch.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(chestStretch);

            Exercise tricepsDips = new Exercise();
            tricepsDips.setName("Triceps Dips");
            tricepsDips.setCategories(
                    Arrays.asList(ExerciseCategory.CHEST, ExerciseCategory.ARMS, ExerciseCategory.SHOULDER_AND_BACK));
            tricepsDips
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            tricepsDips.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(tricepsDips);

            //arms exercise
            Exercise armRaise = new Exercise();
            armRaise.setName("Arm raise");
            armRaise.setCategories(Arrays.asList(ExerciseCategory.ARMS, ExerciseCategory.SHOULDER_AND_BACK));
            armRaise.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            armRaise.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(armRaise);

            Exercise sideArmRaise = new Exercise();
            sideArmRaise.setName("Side Arm raise");
            sideArmRaise.setCategories(Arrays.asList(ExerciseCategory.ARMS, ExerciseCategory.SHOULDER_AND_BACK));
            sideArmRaise
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            sideArmRaise.setVideoUrl(videoUrl + "/Yoga.mp4");
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
            armCircleClockWise.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(armCircleCounterClockWise);

            Exercise diamondPushUp = new Exercise();
            diamondPushUp.setName("Diamond Push up");
            diamondPushUp.setCategories(Arrays.asList(ExerciseCategory.ARMS));
            diamondPushUp
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            diamondPushUp.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(diamondPushUp);

            Exercise punches = new Exercise();
            punches.setName("Punches");
            punches.setCategories(Arrays.asList(ExerciseCategory.ARMS));
            punches.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            punches.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(punches);

            //legs
            Exercise squats = new Exercise();
            squats.setName("Squats");
            squats.setCategories(Arrays.asList(ExerciseCategory.LEGS));
            squats.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            squats.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(squats);

            Exercise sideHops = new Exercise();
            sideHops.setName("Side Hops");
            sideHops.setCategories(Arrays.asList(ExerciseCategory.LEGS));
            sideHops.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            sideHops.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(sideHops);

            Exercise lunges = new Exercise();
            lunges.setName("Lunges");
            lunges.setCategories(Arrays.asList(ExerciseCategory.LEGS));
            lunges.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            lunges.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(lunges);

            Exercise calfRaise = new Exercise();
            calfRaise.setName("Calf Raise");
            calfRaise.setCategories(Arrays.asList(ExerciseCategory.LEGS));
            calfRaise.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            calfRaise.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(calfRaise);

            Exercise calfStretchLeft = new Exercise();
            calfStretchLeft.setName("Calf Stretch Left");
            calfStretchLeft.setCategories(Arrays.asList(ExerciseCategory.LEGS));
            calfStretchLeft
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            calfStretchLeft.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(calfStretchLeft);

            Exercise calfStretchRight = new Exercise();
            calfStretchRight.setName("Calf Stretch Right");
            calfStretchRight.setCategories(Arrays.asList(ExerciseCategory.LEGS));
            calfStretchRight
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            calfStretchRight.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(calfStretchRight);
            exerciseService.save(exercises);
        }


    }
}
