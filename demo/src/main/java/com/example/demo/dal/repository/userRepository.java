package com.example.demo.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dal.models.entities.user;

public interface userRepository extends JpaRepository<user, Long> {

    
} 