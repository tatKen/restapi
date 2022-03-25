package com.test.restapi.repositories;

import com.test.restapi.domain.TestCardIdentity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestCardIdentityRepository extends JpaRepository<TestCardIdentity, Integer>{
    
}
