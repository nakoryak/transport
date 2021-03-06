package ru.serveram.transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.serveram.transport.model.Order;
import ru.serveram.transport.service.OrderService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Pavel Klevakin
 */
@RestController
@RequestMapping(value="/order")
public class OrderController{

    @Autowired
    private OrderService orderService;

    @RequestMapping(value="/opened", method = RequestMethod.GET)
    public List<Order> getOpenedOrders() {
        return orderService.getOpenedOrders();
    }

    //todo: логика работы
    @RequestMapping(value = "/close")
    public Long closeOrder(@RequestParam(value = "id") Long id) {
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
