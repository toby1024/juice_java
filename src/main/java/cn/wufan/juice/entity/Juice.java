package cn.wufan.juice.entity;

import java.sql.Date;

/**
 * Created by zhangbin on 2017/7/26.
 */
public class Juice extends Product {

    public Juice() {
    }

    public Juice(String name, String description, float price, int status,
                 float discount, int header, String image, Store store) {
        super(name, description, price, status, CategoryEnum.JUICE.getCode(), discount, header, image, store);
    }

}
