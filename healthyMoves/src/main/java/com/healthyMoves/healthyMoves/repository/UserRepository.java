package com.healthyMoves.healthyMoves.repository;

import com.healthyMoves.healthyMoves.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByToken(String token);

    @Query(value = "{deleted:false , active : true}", count = true)
    long count();

    User findByEmail(String email);
}
