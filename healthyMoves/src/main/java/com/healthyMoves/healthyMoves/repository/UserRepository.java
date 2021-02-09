package com.healthyMoves.healthyMoves.repository;

import com.healthyMoves.healthyMoves.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByToken(String token);
}
