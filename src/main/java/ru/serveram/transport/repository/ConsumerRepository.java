package ru.serveram.transport.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.serveram.transport.model.Consumer;

/**
 * Created by nakoryakov on 09.08.16.
 * Здесь уже реализованы CRUD методы, чтобы сделать что-то кастомное смотри доку
 * http://docs.spring.io/spring-data/commons/docs/current/reference/html/#repositories.definition
 */
@Repository
public interface ConsumerRepository extends CrudRepository<Consumer, Long> {
}
