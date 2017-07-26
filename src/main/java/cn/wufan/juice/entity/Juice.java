package cn.wufan.juice.entity;

import java.sql.Date;

/**
 * Created by zhangbin on 2017/7/26.
 */
public class Juice extends Product {
    private int category = 1;

    public Juice() {
    }

    public Juice(String name, String description, float price, int status, float discount, String image, Store store) {
        super(name, description, price, status, discount, image, store);
    }

    public int getCategory() {
        return category;
    }

}
