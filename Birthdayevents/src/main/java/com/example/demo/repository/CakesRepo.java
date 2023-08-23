package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CakesEntity;

@Repository

public interface CakesRepo extends JpaRepository<CakesEntity, Integer> {

}
