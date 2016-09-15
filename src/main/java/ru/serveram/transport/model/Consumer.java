package ru.serveram.transport.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by nakoryakov on 09.08.16.
 * Ентити заказчика
 */
@Entity
public class Consumer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    //todo: пока документ не энтити
    //@OneToMany
    //private List<Document> documents;

    public Consumer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //public List<Document> getDocuments() {
    //    return documents;
    //}

    //public void setDocuments(List<Document> documents) {
    //    this.documents = documents;
    //}
}
