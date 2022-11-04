package com.example.springboot.dao.interfaces;

import java.util.Collection;
import java.util.Optional;

public interface Dao<T> {

    Optional<T> get(String id); // get to-do object from id

    Collection<T> getAll();

    void save(T t);

    void update(T t);

    void delete(T t);

}
