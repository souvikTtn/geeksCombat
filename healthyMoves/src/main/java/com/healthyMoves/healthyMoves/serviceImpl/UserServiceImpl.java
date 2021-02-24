package com.healthyMoves.healthyMoves.serviceImpl;

import com.healthyMoves.healthyMoves.command.UserCO;
import com.healthyMoves.healthyMoves.entity.BodyType;
import com.healthyMoves.healthyMoves.entity.User;
import com.healthyMoves.healthyMoves.repository.UserRepository;
import com.healthyMoves.healthyMoves.service.BodyTypeService;
import com.healthyMoves.healthyMoves.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BodyTypeService bodyTypeService;

    @Autowired
    private MessageSource messageSource;

    @Override
    public User save(UserCO userCO) {
        User existingUser = userRepository.findByEmail(userCO.getEmail());
        if (existingUser != null) {
            return existingUser;
        }
        String token = UUID.randomUUID().toString();
        User user = new User();
        user.setEmail(userCO.getEmail());
        user.setSocialId(userCO.getSocialId());
        user.setToken(token);
        return userRepository.save(user);

    }

    @Override
    public String save(User user) {
        String token = UUID.randomUUID().toString();
        user.setToken(token);
        return userRepository.save(user).getToken();
    }

    @Override
    public User findByToken(String token) {
        return userRepository.findByToken(token).orElseThrow(() -> new RuntimeException(messageSource.getMessage(
                "resource.not.found", new String[]{"user"}, LocaleContextHolder.getLocale())));
    }

    @Override
    public long count() {
        return userRepository.count();
    }

    @Override
    public void updateUser(UserCO userCO, String token) {
        User user = userRepository.findByToken(token)
                                  .orElseThrow(() -> new RuntimeException(messageSource.getMessage(
                                          "resource.not.found", new String[]{"user"},
                                          LocaleContextHolder.getLocale())));
        user.setWeight(userCO.getWeight());
        user.setHeight(userCO.getHeight());
        user.setLevel(userCO.getLevel());
        userRepository.save(user);
    }

    @Override
    public Map<String, Object> getUserInfo(String token) {
        BodyType userBodyType;
        double bmi;
        User user = userRepository.findByToken(token).orElseThrow(() -> new RuntimeException(messageSource.getMessage(
                "resource.not.found", new String[]{"user"}, LocaleContextHolder.getLocale())));
        bmi = user.getWeight() / Math.pow(user.getHeight() / 100D, 2);
        if (bmi < 16D) {
            userBodyType = bodyTypeService.findByType(com.healthyMoves.healthyMoves.enums.BodyType.ECTOMORPH);
        }
        if (bmi >= 16D && bmi <= 25D) {
            userBodyType = bodyTypeService.findByType(com.healthyMoves.healthyMoves.enums.BodyType.MESOMORPH);
        } else {
            userBodyType = bodyTypeService.findByType(com.healthyMoves.healthyMoves.enums.BodyType.ENDOMORPH);
        }
        Map<String, Object> response = new HashMap<>();
        response.put("bmiCalculated", bmi);
        response.put("userBodyType", userBodyType);
        return response;
    }
}
