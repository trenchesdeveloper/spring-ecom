package com.trenchesdeveloper.store.repositories;

import com.trenchesdeveloper.store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}