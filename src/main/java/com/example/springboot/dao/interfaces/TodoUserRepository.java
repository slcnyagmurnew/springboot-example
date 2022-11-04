package com.example.springboot.dao.interfaces;

import com.example.springboot.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface TodoUserRepository extends MongoRepository<User, String> {

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}