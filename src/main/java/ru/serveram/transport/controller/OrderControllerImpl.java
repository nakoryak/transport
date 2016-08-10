package ru.serveram.transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.serveram.transport.model.Order;
import ru.serveram.transport.service.OrderService;

import java.util.List;

/**
 * Created by nakoryakov on 10.08.16.
 */
@Controller
public class OrderControllerImpl implements OrderController {

    @Autowired
    OrderService orderService;

    public List<Order> getOpenedOrders() {
        return orderService.getOpenedOrders();
    }

    public Long closeOrder(Long id) {
        return orderService.closeOrder(id);
    }

    //TODO заменить order на DTO
    public Long createOrder(Order order) {
        return orderService.createOrder(order);
    }
}
