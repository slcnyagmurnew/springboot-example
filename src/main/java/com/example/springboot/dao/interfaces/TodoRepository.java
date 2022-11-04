package com.example.springboot.dao.interfaces;

import com.example.springboot.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;

public interface TodoRepository extends MongoRepository<Todo, String> {

    @Query("{id:'?0'}")
    Todo getTodoById(String id);

    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<Todo> findAll(String category);
}
