package com.trenchesdeveloper.store.repositories;

import com.trenchesdeveloper.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}