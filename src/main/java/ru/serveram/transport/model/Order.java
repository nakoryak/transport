package ru.serveram.transport.model;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by nakoryakov on 09.08.16.
 * Ентити заказа
 */
@Entity
public class Order {

    private long id;
    private Date createDate;
    private Date closeDate;
    private long consumerID;
    private long driverID;
    private long addressFromID;
    private long addressToID;
    private boolean isAppointed;
    private double cost;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public long getConsumerID() {
        return consumerID;
    }

    public void setConsumerID(long consumerID) {
        this.consumerID = consumerID;
    }

    public long getDriverID() {
        return driverID;
    }

    public void setDriverID(long driverID) {
        this.driverID = driverID;
    }

    public long getAddressFromID() {
        return addressFromID;
    }

    public void setAddressFromID(long addressFromID) {
        this.addressFromID = addressFromID;
    }

    public long getAddressToID() {
        return addressToID;
    }

    public void setAddressToID(long addressToID) {
        this.addressToID = addressToID;
    }

    public boolean isAppointed() {
        return isAppointed;
    }

    public void setAppointed(boolean appointed) {
        isAppointed = appointed;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    //TODO Добавить и аннотировать поля
}
