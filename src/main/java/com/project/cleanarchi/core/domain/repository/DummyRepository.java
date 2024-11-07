package com.project.cleanarchi.core.domain.repository;

import com.project.cleanarchi.core.domain.entity.DummyEntity;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DummyRepository extends JpaRepository<DummyEntity, UUID> {
    List<DummyEntity> findAll2();
    Optional<DummyEntity> findById(UUID id);
    Optional<DummyEntity> findByName(String name);
}
