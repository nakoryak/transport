package ru.serveram.transport.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.serveram.transport.model.Order;
import ru.serveram.transport.repository.OrderRepository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;

/**
 * Created by nakoryakov on 10.08.16.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private SessionFactory sessionFactory;

    //todo: костыль, логики ноль
    public Long closeOrder(Long id) {
        /*Order order = orderRepository.findOne(id);
        order.setCloseDate(new Date());
        orderRepository.save(order);
        return order.getId();*/
        return id;
    }

    public List<Order> getOpenedOrders() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Order", Order.class).getResultList();
    }

    //Зачем возвращать Id
    //todo: логики так же ноль
    public Long createOrder(Order order) {
        Session session = sessionFactory.getCurrentSession();
        session.save(order);
        //Order savedOrder = orderRepository.save(order);
        return order.getId();
    }
}
