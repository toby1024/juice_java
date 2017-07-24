package cn.wufan.juice_java.entity;

import java.util.List;

/**
 * Created by zhangbin on 2017/7/21.
 */
public class UserRole {

    private List<User> users;
    private List<Role> roles;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
