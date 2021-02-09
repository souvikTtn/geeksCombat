package com.healthyMoves.healthyMoves.serviceImpl;

import com.healthyMoves.healthyMoves.command.UserCO;
import com.healthyMoves.healthyMoves.entity.User;
import com.healthyMoves.healthyMoves.repository.UserRepository;
import com.healthyMoves.healthyMoves.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MessageSource messageSource;

    @Override
    public String save(UserCO userCO) {
        String token = UUID.randomUUID().toString();
        User user = new User();
        user.setEmail(userCO.getEmail());
        user.setSocialId(userCO.getSocialId());
        user.setToken(token);
        return userRepository.save(user).getToken();

    }

    @Override
    public User findByToken(String token) {
        return userRepository.findByToken(token).orElseThrow(() -> new RuntimeException(messageSource.getMessage(
                "resource.not.found", new String[]{"user"}, LocaleContextHolder.getLocale())));
    }
}
