package ru.serveram.transport.controller;

import ru.serveram.transport.model.Order;

import java.util.List;

/**
 * Created by nakoryakov on 09.08.16.
 */
public interface OrderController {

    /**
     * Получаем список открытых заявок, на которые не назначен исполнитель
     * @return
     */
    List<Order> getOpenedOrders();

    /**
     * Закрываем заказ, помечаем его исполненым, надо додумать, что делать с заказами, которые вообще не были выполнены
     * @param id Id - заказа
     * @return
     */
    Long closeOrder(Long id);

    /**
     *
     * @param order Передавать желательно DTO, надо додумать.
     * @return
     */
    Long createOrder(Order order);


}
