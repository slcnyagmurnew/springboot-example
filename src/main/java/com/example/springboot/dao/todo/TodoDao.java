package com.example.springboot.dao.todo;

import com.example.springboot.dao.interfaces.Dao;
import com.example.springboot.dao.interfaces.TodoRepository;
import com.example.springboot.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class TodoDao implements Dao<Todo> {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public Optional<Todo> get(String id) {
        return Optional.ofNullable(todoRepository.getTodoById(id));
    }

    @Override
    public Collection<Todo> getAll() {
        return todoRepository.findAll().stream()
                .filter(Objects::nonNull)
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
    }

    @Override
    public void save(Todo todo) {

    }

    @Override
    public void update(Todo todo) {

    }

    @Override
    public void delete(Todo todo) {

    }
}
