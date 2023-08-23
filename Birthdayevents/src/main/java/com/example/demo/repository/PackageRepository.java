package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.PackageEntity;


public interface PackageRepository extends JpaRepository<PackageEntity, Integer> {

}
