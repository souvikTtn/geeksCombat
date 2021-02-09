package com.healthyMoves.healthyMoves.serviceImpl;

import com.healthyMoves.healthyMoves.command.UserCO;
import com.healthyMoves.healthyMoves.entity.User;
import com.healthyMoves.healthyMoves.repository.UserRepository;
import com.healthyMoves.healthyMoves.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(UserCO userCO) {
        String token = UUID.randomUUID().toString();
        User user = new User();
        user.setEmail(userCO.getEmail());
        user.setSocialId(userCO.getSocialId());
        user.setToken(token);
        userRepository.save(user);
    }
}
