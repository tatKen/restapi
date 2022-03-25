package com.test.restapi.repositories;

import com.test.restapi.domain.TestCardAuto;

import org.springframework.data.jpa.repository.JpaRepository; 

public interface TestCardAutoRepository extends JpaRepository<TestCardAuto, Integer>{
    
}
