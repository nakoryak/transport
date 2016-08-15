package ru.serveram.transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.serveram.transport.model.Order;
import ru.serveram.transport.service.OrderService;

import java.util.List;

/**
 * Pavel Klevakin
 */
@RestController
public class OrderControllerImpl implements OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value="/opened", method = RequestMethod.GET)
    public List<Order> getOpenedOrders() {
        return orderService.getOpenedOrders();
    }

    @RequestMapping(value = "/close", method = RequestMethod.POST)
    public Long closeOrder(Long id) {
        return orderService.closeOrder(id);
    }

    //TODO заменить order на DTO
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Long createOrder(Order order) {
        return orderService.createOrder(order);
    }

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public Order order()
    {
        Order order = new Order();
        order.setAddressFromID(new Long(11111));
        return order;
    }

}
