package ru.serveram.transport.model;

import javax.persistence.*;
import java.util.List;


/**
 * Created by nakoryakov on 09.08.16.
 * Ентити водителя
 */
@Entity
@Table(name="drivers")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String  name;

    @OneToMany
    private List<Vehicle> vehicles;

    public Driver() {
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

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicleID(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
