package cn.wufan.juice.entity;

import java.sql.Date;

/**
 * Created by zhangbin on 2017/7/26.
 */
public class Fruit extends Product {
    private int category = 0;

    public Fruit() {
    }

    public Fruit(String name, String description, float price, int status, float discount, String image, Store store) {
        super(name, description, price, status, discount, image, store);
    }

    public Fruit(String name, String description, float price, int status, float discount, String image, Store store, int category, Date createdAt, Date updatedAt) {
        super(name, description, price, status, discount, image, store);
        this.category = category;
        super.setCreatedAt(createdAt);
        super.setUpdatedAt(updatedAt);
    }

    public int getCategory() {
        return category;
    }
}
