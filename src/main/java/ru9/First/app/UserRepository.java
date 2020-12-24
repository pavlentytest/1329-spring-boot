package ru9.First.app;

import org.springframework.data.repository.CrudRepository;


// CRUD

// create, read, update, delete

public interface UserRepository extends CrudRepository<User, Integer> {
}
