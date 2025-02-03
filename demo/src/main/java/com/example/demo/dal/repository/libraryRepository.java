package com.example.demo.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dal.models.entities.library;

public interface libraryRepository extends JpaRepository<library, Long> {

    
} 