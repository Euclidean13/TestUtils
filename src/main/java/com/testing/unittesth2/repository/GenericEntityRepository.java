package com.testing.unittesth2.repository;

import com.testing.unittesth2.entities.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GenericEntityRepository extends JpaRepository<GenericEntity, Integer> {

    List<GenericEntity> findAll();
}
