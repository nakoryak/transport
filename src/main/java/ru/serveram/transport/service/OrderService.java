package ru.serveram.transport.service;

import ru.serveram.transport.model.Order;

import java.util.List;

/**
 * Created by nakoryakov on 10.08.16.
 */
public interface OrderService {
    Long closeOrder(Long id);

    List<Order> getOpenedOrders();

    Long createOrder(Order order);
}
