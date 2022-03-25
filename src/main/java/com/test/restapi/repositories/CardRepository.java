package com.test.restapi.repositories;

import java.math.BigInteger;
import java.util.Optional;

import com.test.restapi.domain.UimCardModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<UimCardModel, BigInteger>, CardRepositoryCustom {
    Optional<UimCardModel> findByName(String name);
}
