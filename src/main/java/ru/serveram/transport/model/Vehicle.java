package ru.serveram.transport.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by nakoryakov on 09.08.16.
 * Ентити техники, предлагаю от него уже наследовать конкретный транспорт
 */
@Entity
public class Vehicle {
    //TODO Добавить и аннотировать поля

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long typeID;


}
