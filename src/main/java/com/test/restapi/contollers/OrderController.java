package com.test.restapi.contollers;

import com.test.restapi.domain.UimOrderModel;
import com.test.restapi.services.OrderService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    private final static Logger logger = LogManager.getLogger(OrderController.class);

    @GetMapping("/{id}")
    public @ResponseBody
    UimOrderModel getOrderDetail(@PathParam("id") String id) {
        return orderService.getOrderById(Long.valueOf(id));
    }
}
