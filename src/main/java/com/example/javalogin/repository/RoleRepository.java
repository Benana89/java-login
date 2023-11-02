package com.example.javalogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javalogin.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
