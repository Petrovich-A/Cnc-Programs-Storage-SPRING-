package by.petrovich.storage.accessingdatajpa;

import by.petrovich.storage.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findBySurName(String surName);

    Optional<User> findById(Long id);
}
