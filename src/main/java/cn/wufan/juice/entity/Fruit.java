package cn.wufan.juice.entity;

import java.sql.Date;

/**
 * Created by zhangbin on 2017/7/26.
 */
public class Fruit extends Product {

    public Fruit() {
    }

    public Fruit(String name, String description, float price, int status, float discount, int header, String image, Store store) {
        super(name, description, price, status, CategoryEnum.FRUIT.getCode(), discount, header, image, store);
    }

    public Fruit(String name, String description, float price, int status, float discount, int header, String image,
                 Store store, int category, Date createdAt, Date updatedAt) {
        super(name, description, price, status, CategoryEnum.FRUIT.getCode(), discount, header, image, store);
        super.setCreatedAt(createdAt);
        super.setUpdatedAt(updatedAt);
    }

}
