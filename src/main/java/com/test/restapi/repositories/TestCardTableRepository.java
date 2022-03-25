package com.test.restapi.repositories;

import com.test.restapi.domain.TestCardTable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestCardTableRepository extends JpaRepository<TestCardTable, Integer>{
    
}
