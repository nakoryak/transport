package ru.serveram.transport.model;

import javax.persistence.Entity;

/**
 * Created by nakoryakov on 09.08.16.
 * Ентити водителя
 */
@Entity
public class Driver {
    //TODO Добавить и аннотировать поля
    private long id;
    private String  name;
    private long vehicleID;


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

    public long getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(long vehicleID) {
        this.vehicleID = vehicleID;
    }
}
