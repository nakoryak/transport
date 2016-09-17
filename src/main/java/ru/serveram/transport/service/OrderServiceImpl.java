package ru.serveram.transport.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Order> getClosedOrders() {
        Session session = sessionFactory.getCurrentSession();
        List<Order> result = session.createQuery("SELECT orders FROM Order orders where orders.closeDate is not null", Order.class).getResultList();
        return result.isEmpty() ? null : result; //в лучших традициях LSD
    }

    //todo: логики ноль
    public Long closeOrder(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Order order = session.get(Order.class, id);
        order.setCloseDate(new Date());
        session.save(order);
        return order.getId();
    }
    //
    public List<Order> getOpenedOrders() {
        Session session = sessionFactory.getCurrentSession();
        List<Order> result = session.createQuery("SELECT orders FROM Order orders where orders.closeDate is null", Order.class).getResultList();
        return result.isEmpty() ? null : result; //в лучших традициях LSD
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
