package com.healthyMoves.healthyMoves.repository;

import com.healthyMoves.healthyMoves.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
