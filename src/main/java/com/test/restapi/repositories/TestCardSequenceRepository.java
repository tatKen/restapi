package com.test.restapi.repositories;

import com.test.restapi.domain.TestCardSequence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestCardSequenceRepository extends JpaRepository<TestCardSequence, Integer>{
    
}
