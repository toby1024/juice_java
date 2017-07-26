package cn.wufan.juice.entity;

import java.sql.Date;

/**
 * Created by zhangbin on 2017/7/26.
 */
public abstract class Product {
    private Long id;
    private String name;
    private String description;
    private float price;
    private int status;
    private float discount;
    private Store store;
    private String image;
    private Date createdAt;
    private Date updatedAt;

    public Product() {
    }

    public Product(String name, String description, float price, int status, float discount, String image, Store store) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.status = status;
        this.discount = discount;
        this.image = image;
        this.store = store;
        this.createdAt = new Date(System.currentTimeMillis());
        this.updatedAt = new Date(System.currentTimeMillis());
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
