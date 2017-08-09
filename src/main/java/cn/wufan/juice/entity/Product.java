package cn.wufan.juice.entity;

import java.sql.Date;

/**
 * Created by zhangbin on 2017/7/26.
 */
public class Product {
    private Long id;
    private String name;
    private String description;
    private float price;
    private int status;
    private float discount;
    private int category;
    private Store store;
    private String image;
    private int header;
    private int hot;
    private Date createdAt;
    private Date updatedAt;

    /**
     * 类型枚举 fruit：0 ， juice：1.
     */
    public enum CategoryEnum {
        FRUIT(0), JUICE(1);

        private int code;

        private CategoryEnum(int i) {
            this.code = i;
        }

        public int getCode() {
            return code;
        }
    }

    /**
     * 状态枚举 active：1，archived：0.
     */
    public enum StatusEnum {
        ACTIVE(1), ARCHIVED(0);
        private int code;

        private StatusEnum(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }

    public Product() {
    }

    public Product(String name, String description, float price, int status, int category,
                   float discount, int header, String image, Store store) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.status = status;
        this.category = category;
        this.discount = discount;
        this.image = image;
        this.store = store;
        this.header = header;
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

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
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

    public int getHeader() {
        return header;
    }

    public void setHeader(int header) {
        this.header = header;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
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
