package com.example.springboot.dao.interfaces;

import com.example.springboot.model.ERole;
import com.example.springboot.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {

    Optional<Role> findByName(ERole name);
}
