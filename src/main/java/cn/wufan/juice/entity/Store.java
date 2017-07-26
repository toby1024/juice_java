package cn.wufan.juice.entity;

import java.sql.Date;

/**
 * Created by zhangbin on 2017/7/26.
 */
public class Store {
    private Long id;
    private String name;
    private String address;
    private String linkMan;
    private String phone;
    private int status;
    private Date createdAt;
    private Date updatedAt;

    public Store() {
    }

    public Store(String name, String address, String linkMan, String phone, int status) {
        this.name = name;
        this.address = address;
        this.linkMan = linkMan;
        this.phone = phone;
        this.status = status;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
