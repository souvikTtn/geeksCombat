package com.healthyMoves.healthyMoves.service;

import com.healthyMoves.healthyMoves.command.UserCO;
import com.healthyMoves.healthyMoves.entity.User;

public interface UserService {
    User save(UserCO userCO);

    String save(User user);

    User findByToken(String token);

    long count();

    public void updateUser(UserCO userCO, String token);
}
