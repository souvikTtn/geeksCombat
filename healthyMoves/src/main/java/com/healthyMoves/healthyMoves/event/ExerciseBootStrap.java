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

            TimePeriod timePeriod = new TimePeriod();
            timePeriod.setSets(3);
            timePeriod.setReps(10);


            //Chest Exercise
            Exercise jumpingJacks = new Exercise();
            jumpingJacks.setName("Jumping Jacks");
            jumpingJacks
                    .setCategories(Arrays.asList(ExerciseCategory.CHEST, ExerciseCategory.ARMS, ExerciseCategory.LEGS
                            , ExerciseCategory.SHOULDER_AND_BACK));
            jumpingJacks
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            TimePeriod jumpingJacksTP = new TimePeriod();
            jumpingJacksTP.setTime(10);
            jumpingJacks.setPeriod(jumpingJacksTP);
            jumpingJacks.setLogoUrl(logoUrl + "/jumpingJack.png");
            jumpingJacks.setVideoUrl(videoUrl + "/Yoga.mp4");
            exercises.add(jumpingJacks);

            Exercise inclinePushUp = new Exercise();
            inclinePushUp.setName("InclinePushUp");
            inclinePushUp.setCategories(Arrays.asList(ExerciseCategory.CHEST));
            inclinePushUp
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            inclinePushUp.setLogoUrl(logoUrl + "/pushUp.png");
            inclinePushUp.setVideoUrl(videoUrl + "/Yoga.mp4");
            TimePeriod inclinePushUpTP = new TimePeriod();
            inclinePushUpTP.setSets(3);
            inclinePushUpTP.setReps(10);
            inclinePushUp.setPeriod(inclinePushUpTP);
            exercises.add(inclinePushUp);

            Exercise kneePushUp = new Exercise();
            kneePushUp.setName("kneePushUp");
            kneePushUp.setCategories(Arrays.asList(ExerciseCategory.CHEST, ExerciseCategory.SHOULDER_AND_BACK));
            kneePushUp
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            kneePushUp.setLogoUrl(logoUrl + "/KneePushUps.png");
            kneePushUp.setVideoUrl(videoUrl + "/Yoga.mp4");
            TimePeriod kneePushUpTP = new TimePeriod();
            kneePushUpTP.setSets(3);
            kneePushUpTP.setReps(10);
            kneePushUp.setPeriod(kneePushUpTP);
            exercises.add(kneePushUp);

            Exercise pushUp = new Exercise();
            pushUp.setName("push up");
            pushUp.setCategories(Arrays.asList(ExerciseCategory.CHEST, ExerciseCategory.ARMS));
            pushUp.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            pushUp.setLogoUrl(logoUrl + "/pushUp.png");
            pushUp.setVideoUrl(videoUrl + "/Yoga.mp4");
            TimePeriod pushUpTP = new TimePeriod();
            pushUpTP.setSets(3);
            pushUpTP.setReps(10);
            pushUp.setPeriod(pushUpTP);
            exercises.add(pushUp);

            Exercise wideArmPushUp = new Exercise();
            wideArmPushUp.setName("wideArm Push Up ");
            wideArmPushUp.setCategories(Arrays.asList(ExerciseCategory.CHEST));
            wideArmPushUp
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            wideArmPushUp.setLogoUrl(logoUrl + "/pushUp.png");
            wideArmPushUp.setVideoUrl(videoUrl + "/Yoga.mp4");
            TimePeriod wideArmPushUpTP = new TimePeriod();
            wideArmPushUpTP.setSets(3);
            wideArmPushUpTP.setReps(10);
            wideArmPushUp.setPeriod(wideArmPushUpTP);
            exercises.add(wideArmPushUp);

            Exercise cobraStretch = new Exercise();
            cobraStretch.setName("cobraStretch");
            cobraStretch.setCategories(Arrays.asList(ExerciseCategory.CHEST));
            cobraStretch
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            cobraStretch.setLogoUrl(logoUrl + "/cobraStretch.png");
            cobraStretch.setVideoUrl(videoUrl + "/Yoga.mp4");
            TimePeriod cobraStretchTP = new TimePeriod();
            cobraStretchTP.setTime(30);
            cobraStretch.setPeriod(cobraStretchTP);
            exercises.add(cobraStretch);

            Exercise chestStretch = new Exercise();
            chestStretch.setName("chestStretch");
            chestStretch.setCategories(Arrays.asList(ExerciseCategory.CHEST));
            chestStretch
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            chestStretch.setLogoUrl(logoUrl + "/chestStretch.png");
            chestStretch.setVideoUrl(videoUrl + "/Yoga.mp4");
            TimePeriod chestStretchTP = new TimePeriod();
            chestStretchTP.setTime(30);
            chestStretch.setPeriod(chestStretchTP);
            exercises.add(chestStretch);

            Exercise tricepsDips = new Exercise();
            tricepsDips.setName("Triceps Dips");
            tricepsDips.setCategories(
                    Arrays.asList(ExerciseCategory.CHEST, ExerciseCategory.ARMS, ExerciseCategory.SHOULDER_AND_BACK));
            tricepsDips
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            tricepsDips.setLogoUrl(logoUrl + "/tricepsDips.jpg");
            tricepsDips.setVideoUrl(videoUrl + "/Yoga.mp4");
            TimePeriod tricepsDipsTP = new TimePeriod();
            tricepsDipsTP.setSets(3);
            tricepsDipsTP.setReps(10);
            tricepsDips.setPeriod(tricepsDipsTP);
            exercises.add(tricepsDips);

            //arms exercise
            Exercise armRaise = new Exercise();
            armRaise.setName("Arm raise");
            armRaise.setCategories(Arrays.asList(ExerciseCategory.ARMS, ExerciseCategory.SHOULDER_AND_BACK));
            armRaise.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            armRaise.setLogoUrl(logoUrl + "/ArmRaise.jpg");
            armRaise.setVideoUrl(videoUrl + "/Yoga.mp4");
            TimePeriod armRaiseTP = new TimePeriod();
            armRaiseTP.setSets(3);
            armRaiseTP.setReps(10);
            armRaise.setPeriod(armRaiseTP);
            exercises.add(armRaise);

            Exercise sideArmRaise = new Exercise();
            sideArmRaise.setName("Side Arm raise");
            sideArmRaise.setCategories(Arrays.asList(ExerciseCategory.ARMS, ExerciseCategory.SHOULDER_AND_BACK));
            sideArmRaise
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            sideArmRaise.setLogoUrl(logoUrl + "/SideArmraise.png");
            sideArmRaise.setVideoUrl(videoUrl + "/Yoga.mp4");
            TimePeriod sideArmRaiseTP = new TimePeriod();
            sideArmRaiseTP.setSets(3);
            sideArmRaiseTP.setReps(10);
            sideArmRaise.setPeriod(sideArmRaiseTP);
            exercises.add(sideArmRaise);

            Exercise armCircleClockWise = new Exercise();
            armCircleClockWise.setName("Arm circle clockwise");
            armCircleClockWise.setCategories(Arrays.asList(ExerciseCategory.ARMS));
            armCircleClockWise
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            armCircleClockWise.setLogoUrl(logoUrl + "/armCircleClockwise.png");
            TimePeriod armCircleClockWiseTP = new TimePeriod();
            armCircleClockWiseTP.setSets(3);
            armCircleClockWiseTP.setReps(10);
            armCircleClockWise.setPeriod(armCircleClockWiseTP);
            exercises.add(armCircleClockWise);

            Exercise armCircleCounterClockWise = new Exercise();
            armCircleCounterClockWise.setName("Arm circle counter clockwise");
            armCircleCounterClockWise.setCategories(Arrays.asList(ExerciseCategory.ARMS));
            armCircleCounterClockWise
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            armCircleCounterClockWise.setLogoUrl(logoUrl + "/armCircleClockwise.png");
            armCircleCounterClockWise.setVideoUrl(videoUrl + "/Yoga.mp4");
            TimePeriod armCircleCounterClockWiseTp = new TimePeriod();
            armCircleCounterClockWiseTp.setReps(10);
            armCircleCounterClockWiseTp.setSets(3);
            armCircleCounterClockWise.setPeriod(armCircleCounterClockWiseTp);
            exercises.add(armCircleCounterClockWise);

            Exercise diamondPushUp = new Exercise();
            diamondPushUp.setName("Diamond Push up");
            diamondPushUp.setCategories(Arrays.asList(ExerciseCategory.ARMS));
            diamondPushUp
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            diamondPushUp.setLogoUrl(logoUrl + "/diamondPushUp.png");
            diamondPushUp.setVideoUrl(videoUrl + "/Yoga.mp4");
            diamondPushUp.setPeriod(timePeriod);
            exercises.add(diamondPushUp);

            Exercise punches = new Exercise();
            punches.setName("Punches");
            punches.setCategories(Arrays.asList(ExerciseCategory.ARMS));
            punches.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            punches.setLogoUrl(logoUrl + "/Punches.png");
            punches.setVideoUrl(videoUrl + "/Yoga.mp4");
            TimePeriod punchesTP = new TimePeriod();
            punchesTP.setTime(30);
            punches.setPeriod(punchesTP);
            exercises.add(punches);

            //legs
            Exercise squats = new Exercise();
            squats.setName("Squats");
            squats.setCategories(Arrays.asList(ExerciseCategory.LEGS));
            squats.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            squats.setLogoUrl(logoUrl + "/Squats.png");
            squats.setVideoUrl(videoUrl + "/Yoga.mp4");
            squats.setPeriod(timePeriod);
            exercises.add(squats);

            Exercise sideHops = new Exercise();
            sideHops.setName("Side Hops");
            sideHops.setCategories(Arrays.asList(ExerciseCategory.LEGS));
            sideHops.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            sideHops.setLogoUrl(logoUrl + "/sideHops.png");
            sideHops.setVideoUrl(videoUrl + "/Yoga.mp4");
            sideHops.setPeriod(timePeriod);
            exercises.add(sideHops);

            Exercise lunges = new Exercise();
            lunges.setName("Lunges");
            lunges.setCategories(Arrays.asList(ExerciseCategory.LEGS));
            lunges.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            lunges.setLogoUrl(logoUrl + "/Lunges.png");
            lunges.setVideoUrl(videoUrl + "/Yoga.mp4");
            lunges.setPeriod(timePeriod);
            exercises.add(lunges);

            Exercise calfRaise = new Exercise();
            calfRaise.setName("Calf Raise");
            calfRaise.setCategories(Arrays.asList(ExerciseCategory.LEGS));
            calfRaise.setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            calfRaise.setLogoUrl(logoUrl + "/calfRaise.png");
            calfRaise.setVideoUrl(videoUrl + "/Yoga.mp4");
            calfRaise.setPeriod(timePeriod);
            exercises.add(calfRaise);

            Exercise calfStretchLeft = new Exercise();
            calfStretchLeft.setName("Calf Stretch Left");
            calfStretchLeft.setCategories(Arrays.asList(ExerciseCategory.LEGS));
            calfStretchLeft
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            calfStretchLeft.setLogoUrl(logoUrl + "/calfStretchLeft.png");
            calfStretchLeft.setVideoUrl(videoUrl + "/Yoga.mp4");
            calfStretchLeft.setPeriod(timePeriod);
            exercises.add(calfStretchLeft);

            Exercise calfStretchRight = new Exercise();
            calfStretchRight.setName("Calf Stretch Right");
            calfStretchRight.setCategories(Arrays.asList(ExerciseCategory.LEGS));
            calfStretchRight
                    .setLevel(Arrays.asList(ExerciseLevel.BEGINNER, ExerciseLevel.EXPERT, ExerciseLevel.INTERMEDIATE));
            calfStretchRight.setLogoUrl(logoUrl + "/calfStretchRight.png");
            calfStretchRight.setVideoUrl(videoUrl + "/Yoga.mp4");
            calfStretchRight.setPeriod(timePeriod);
            exercises.add(calfStretchRight);
            exerciseService.save(exercises);
        }


    }
}
