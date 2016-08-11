package ru.serveram.transport.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by nakoryakov on 09.08.16.
 * Ентити заказа
 */
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date createDate;
    private Date closeDate;
    private Long consumerID;
    private Long driverID;
    private Long addressFromID;
    private Long addressToID;
    private Boolean isAppointed;
    private Double cost;
    private Long statusID;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public Long getConsumerID() {
        return consumerID;
    }

    public void setConsumerID(Long consumerID) {
        this.consumerID = consumerID;
    }

    public Long getDriverID() {
        return driverID;
    }

    public void setDriverID(Long driverID) {
        this.driverID = driverID;
    }

    public Long getAddressFromID() {
        return addressFromID;
    }

    public void setAddressFromID(Long addressFromID) {
        this.addressFromID = addressFromID;
    }

    public Long getAddressToID() {
        return addressToID;
    }

    public void setAddressToID(Long addressToID) {
        this.addressToID = addressToID;
    }

    public Boolean isAppointed() {
        return isAppointed;
    }

    public void setAppointed(Boolean appointed) {
        isAppointed = appointed;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
