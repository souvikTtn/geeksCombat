package com.healthyMoves.healthyMoves.service;

import com.healthyMoves.healthyMoves.command.UserCO;
import com.healthyMoves.healthyMoves.entity.User;

public interface UserService {
    String save(UserCO userCO);
    User findByToken(String token);
}
