package com.example.javalogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.javalogin.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String userName);

}
