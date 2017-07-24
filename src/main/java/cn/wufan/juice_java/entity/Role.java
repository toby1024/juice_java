package cn.wufan.juice_java.entity;

/**
 * Created by zhangbin on 2017/7/21.
 */
public class Role {
    private Long id;
    private String name;
    private int status;

    public Role() {
    }

    public Role(String name, int status) {
        this.name = name;
        this.status = status;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
