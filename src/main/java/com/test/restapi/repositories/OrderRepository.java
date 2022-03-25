package com.test.restapi.repositories;

import com.test.restapi.domain.UimOrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<UimOrderModel, Long> {
}
