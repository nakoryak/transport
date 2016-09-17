package ru.serveram.transport.model;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by nakoryakov on 09.08.16.
 * Edit by pavel.klevakin on 10.09.16
 * Ентити заказа
 */
@Entity
@Table(name = "orders")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "close_date")
    private Date closeDate;
    @Column(name = "consumer_ID")
    private Long consumerID;
    @Column(name = "driver_ID")
    private Long driverID;
    @Column(name = "address_from_ID")
    private Long addressFromID;
    @Column(name = "address_to_ID")
    private Long addressToID;
    @Column(name = "is_Appointed")
    private Boolean isAppointed;
    @Column(name = "cost")
    private Double cost;
    @Column(name = "status_ID")
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

    public Boolean getAppointed() { return isAppointed; }

    public Long getStatusID() { return statusID; }

    public void setStatusID(Long statusID) { this.statusID = statusID; }
}
