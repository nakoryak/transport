package ru.serveram.transport.model;

import javax.persistence.Entity;

/**
 * Created by nakoryakov on 09.08.16.
 * Ентити заказчика
 */
@Entity
public class Consumer {

    private long id;
    private String name;
    private long documentID;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDocumentID() {
        return documentID;
    }

    public void setDocumentID(long documentID) {
        this.documentID = documentID;
    }


    //TODO Добавить и аннотировать поля
}
