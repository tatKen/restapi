package com.test.restapi.services;

import com.test.restapi.contollers.OrderController;
import com.test.restapi.domain.UimOrderModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderServiceImplTest {

    final private static Logger logger = LogManager.getLogger(OrderServiceImplTest.class);

    @Autowired
    OrderController orderController;

    @Autowired
    OrderService orderService; 

    @Test
    public void getOrderById() {
        logger.info("Test start --------------------------------------- ");

        Long id = Long.valueOf("58781");

        // UimOrderModel order = orderController.getOrderDetail("58781");

        Long orderOid = new Long(58781); 

        UimOrderModel order = orderService.getOrderById(orderOid);     

        logger.info("------------------ order details ---------------------------- ");
        logger.info("order status="+order.getStatus());
        logger.info("deployment scenario="+order.getDeploymentScenario());
        logger.info("product description="+order.getToImsl1pid().getPrdshtds());

        logger.info("Test start --------------------------------------- ");
    }
}