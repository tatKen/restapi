package com.test.restapi.services;

import com.test.restapi.domain.UimOrderModel;
import com.test.restapi.repositories.OrderRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{

    private final static Logger logger = LogManager.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public UimOrderModel getOrderById(Long id) {

        Optional<UimOrderModel> rtnOrder = orderRepository.findById(id);

        logger.info("result order size="+orderRepository.count());

        return rtnOrder.get();
    }
}
