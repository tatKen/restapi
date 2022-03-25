package com.test.restapi.services;

import com.test.restapi.domain.UimOrderModel;

public interface OrderService {
    public UimOrderModel getOrderById(Long id);
}
