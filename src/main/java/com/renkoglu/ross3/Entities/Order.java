package com.renkoglu.ross3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Orders")
public class Order implements IEntity{

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "User_Id")
    private String userId;

    @Column(name = "Orders")
    private String orders;

    @Column(name = "Price")
    private String price;

    @Column(name = "Payment_Method")
    private String paymentMethod;

    @Column(name = "Status")
    private String status;

    @Column(name = "Guest_User")
    private String guestUser;

    public Order(int id, String userId, String orders, String price, String paymentMethod, String status, String guestUser) {
        this.id = id;
        this.userId = userId;
        this.orders = orders;
        this.price = price;
        this.paymentMethod = paymentMethod;
        this.status = status;
        this.guestUser = guestUser;
    }

    public Order() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGuestUser() {
        return guestUser;
    }

    public void setGuestUser(String guestUser) {
        this.guestUser = guestUser;
    }
}
