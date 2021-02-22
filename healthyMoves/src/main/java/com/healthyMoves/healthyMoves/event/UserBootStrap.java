package com.healthyMoves.healthyMoves.event;

import com.healthyMoves.healthyMoves.entity.User;
import com.healthyMoves.healthyMoves.enums.AuthProvider;
import com.healthyMoves.healthyMoves.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserBootStrap {

    @Autowired
    private UserService userService;


    @EventListener(ContextRefreshedEvent.class)
    public void setUp() {
        log.info("=>Setting up User");
        if (userService.count() == 0) {
            User user = new User();
            user.setEmail("souvikc40@gmail.com");
            user.setSocialId("souvikdgreat");
            user.setHeight(168D);
            user.setWeight(65D);
            user.setProvider(AuthProvider.GOOGLE);
            log.info("==>USER TOKEN {}", userService.save(user));
            log.info("=>Setting up User successfull");
        }
    }
}
