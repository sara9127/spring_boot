package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {



    List<User> findUserByName(String name);
    //List<User> findUserBy;

    Iterable<User> findUserById(Integer id);
}