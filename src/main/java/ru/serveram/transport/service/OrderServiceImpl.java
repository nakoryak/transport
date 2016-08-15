package ru.serveram.transport.service;

import org.springframework.stereotype.Service;
import ru.serveram.transport.model.Order;
import ru.serveram.transport.repository.OrderRepository;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by nakoryakov on 10.08.16.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    OrderRepository orderRepository;

    public Long closeOrder(Long id) {
        Order order = orderRepository.findOne(id);
        order.setCloseDate(new Date());
        orderRepository.save(order);
        return order.getId();
    }

    public List<Order> getOpenedOrders() {
        return orderRepository.findAllWhereCloseDateIsNull();
    }

    //Зачем возвращать Id
    public Long createOrder(Order order) {
        Order savedOrder = orderRepository.save(order);
        return savedOrder.getId();
    }
}
