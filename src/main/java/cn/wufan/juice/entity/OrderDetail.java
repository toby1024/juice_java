package cn.wufan.juice.entity;

import java.sql.Date;

/**
 * Created by zhangbin on 2017/7/26.
 */
public class OrderDetail {
    private Long id;
    private Order order;
    private int amount;
    private float price;
    private float fee;
    private int status;
    private Date createdAt;

    public OrderDetail() {
    }

    public OrderDetail(Order order, int amount, float price, float fee, int status) {
        this.order = order;
        this.amount = amount;
        this.price = price;
        this.fee = fee;
        this.status = status;
        this.createdAt = new Date(System.currentTimeMillis());
    }

    public boolean active(){
        return this.status == 1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
