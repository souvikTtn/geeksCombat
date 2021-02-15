package com.healthyMoves.healthyMoves.event;


import com.healthyMoves.healthyMoves.entity.BodyType;
import com.healthyMoves.healthyMoves.service.BodyTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class BodyTypeBootStrap {

    @Autowired
    private BodyTypeService bodyTypeService;

    @EventListener(ContextRefreshedEvent.class)
    public void setUpBodyType() {
        log.info("==> Setting up bodytypes");

        if (bodyTypeService.count() == 0) {
            BodyType ectomorph = new BodyType();
            ectomorph.setType(com.healthyMoves.healthyMoves.enums.BodyType.ECTOMORPH);
            ectomorph.setDescription("Typical Characteristics:\n" +
                                     "\n" +
                                     "Long and lean\n" +
                                     "Delicate frame\n" +
                                     "“Hardgainer” – Finds it difficult to build muscle and fat\n" +
                                     "Body similar to a marathon runner\n" +
                                     "Fast metabolism\n" +
                                     "Training:\n" +
                                     "\n" +
                                     "If you have the ectomorph body type, then you will find that it is difficult " +
                                     "for " +
                                     "you to gain muscle as well as fat. To help with this, try focusing on compound " +
                                     "movements as opposed to isolated movements. This is because you will use more " +
                                     "muscle groups in the one exercise.\n" +
                                     "\n" +
                                     "For example, the bench press works out muscles in your chest, shoulders and " +
                                     "triceps" +
                                     " using your shoulders and elbow. In contrast, the bicep curl is an isolated " +
                                     "movement that only uses the bicep.\n" +
                                     "\n" +
                                     "While you shouldn’t completely shun isolation movements from your training, " +
                                     "your " +
                                     "main focus should be on the big compound exercises. Then use isolation " +
                                     "movements as" +
                                     " accessories or to finish a workout.\n" +
                                     "\n" +
                                     "Nutrition:\n" +
                                     "\n" +
                                     "Those with the ectomorph body type are able to get away with eating more carbs " +
                                     "than" +
                                     " endomorphs and mesomorphs. However, this doesn’t mean that you can eat " +
                                     "whatever " +
                                     "you want and not have it affect your body.\n" +
                                     "\n" +
                                     "That being said, it is best to stick to complex carbs that can leave you " +
                                     "feeling " +
                                     "fuller for longer. It will also help to push protein to your muscles to help " +
                                     "them " +
                                     "to grow. This includes brown rice and brown bread.\n" +
                                     "\n" +
                                     "Notes:\n" +
                                     "\n" +
                                     "As ectomorphs can find it quite challenging to pack on size, it may be " +
                                     "beneficial " +
                                     "to use additional supplements in conjunction with a healthy and well-rounded " +
                                     "diet. " +
                                     "Supplements such as BCAAs or protein shakes could give you that extra boost.");

            BodyType endomorph = new BodyType();
            endomorph.setType(com.healthyMoves.healthyMoves.enums.BodyType.ENDOMORPH);
            endomorph.setDescription("Typical Characteristics:\n" +
                                     "\n" +
                                     "Stocky build\n" +
                                     "Wider body\n" +
                                     "Stores fuel (both muscle and fat) in the lower half of their bodies\n" +
                                     "Has more muscle as well but usually, this comes with more fat\n" +
                                     "Has the best strength advantage out of the three different body types but may " +
                                     "find " +
                                     "it difficult to stay lean\n" +
                                     "Slow metabolism\n" +
                                     "Training:\n" +
                                     "\n" +
                                     "To help shock the body into losing fat, it is best for endomorphs to up their " +
                                     "intense aerobic exercise by focusing on interval training such as HIIT " +
                                     "(high-intensity interval training) over LISS (low-intensity steady state " +
                                     "cardio).\n" +
                                     "\n" +
                                     "They should train their overall body to see results and not just focus on one " +
                                     "area" +
                                     ".\n" +
                                     "\n" +
                                     "To further enhance their metabolism, endomorphs should include both hypertrophy" +
                                     " " +
                                     "(muscle building – heavy weight, fewer reps) with conditioning. This way, your " +
                                     "metabolism will be fired up, even hours after your training is done.\n" +
                                     "\n" +
                                     "Nutrition:\n" +
                                     "\n" +
                                     "Endomorphs do need to have a stricter eating plan than the others. Unlike " +
                                     "ectomorphs, those with the endomorph body type should eat fewer carbs and " +
                                     "increase " +
                                     "their higher protein intake. They should avoid simple carbs like white bread " +
                                     "and " +
                                     "eat more complex ones.\n" +
                                     "\n" +
                                     "Notes:\n" +
                                     "\n" +
                                     "Stress levels can cause endomorphs to keep fat around their midsection. To help" +
                                     " " +
                                     "with this, you should avoid overtraining so that your body can properly recover" +
                                     ". " +
                                     "Also, get your beauty sleep.");

            BodyType mesomorph = new BodyType();
            mesomorph.setType(com.healthyMoves.healthyMoves.enums.BodyType.MESOMORPH);
            mesomorph.setDescription("Typical Characteristics:\n" +
                                     "\n" +
                                     "Middle of the body types\n" +
                                     "Can be lean and muscular simultaneously\n" +
                                     "Natural athletics build with well-defined muscles\n" +
                                     "Training:\n" +
                                     "\n" +
                                     "In between ectomorph and endomorph is the mesomorph body type. Mesomorphs find " +
                                     "it " +
                                     "easier to build muscle and lose fat than the ectomorphs and endomorphs " +
                                     "respectively" +
                                     ".\n" +
                                     "\n" +
                                     "This is why the mesomorph body type means that you do not have to go insanely " +
                                     "heavy" +
                                     " on the weights to get results. You can lift moderately and still progress.\n" +
                                     "\n" +
                                     "However, it is also best to include some aerobic exercise as well, because " +
                                     "while " +
                                     "they can lose fat easier than mesomorphs, it doesn’t mean that they are " +
                                     "completely " +
                                     "immune. Aerobic exercise with help get your heart rate up and your blood " +
                                     "pumping.\n" +
                                     "\n" +
                                     "Nutrition:\n" +
                                     "\n" +
                                     "If you have a mesomorph body type, your eating plan should include equal " +
                                     "amounts of" +
                                     " protein and fat, with a moderate amount of carbs making up the rest. Like I " +
                                     "mentioned with the ectomorph and endomorph body type, you should still focus on" +
                                     " " +
                                     "complex carbs to help give your body energy and keep full in a sustainable and " +
                                     "healthy way.");

            List<BodyType> bodyTypes = new ArrayList<>();
            bodyTypes.add(ectomorph);
            bodyTypes.add(endomorph);
            bodyTypes.add(mesomorph);
            bodyTypes.forEach(bodyType -> bodyTypeService.save(bodyType));
            log.info("==> Setting up bodytypes successfull");
        }
    }
}
