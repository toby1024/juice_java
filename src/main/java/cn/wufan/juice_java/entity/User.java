package cn.wufan.juice_java.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by zhangbin on 2017/7/20.
 */
public class User {
    private Long id;
    private String password;
    private String salt;
    private String superuser;
    private String username;
    private String email;
    private int status;
    private Date createdAt;
    private Date updatedAt;
    private List<Role> roles;

    public User() {
    }

    public User(String password, String username, String email) {
        this.password = password;
        this.username = username;
        this.email = email;
        this.createdAt = new Date(System.currentTimeMillis());
        this.salt = UUID.randomUUID().toString();
    }

    public String[] getRoleNames(){
        if(this.getRoles() == null || this.getRoles().isEmpty()){
            return null;
        }
        List<String> names = new ArrayList<>(this.getRoles().size());
        for(Role role : this.getRoles()){
            names.add(role.getName());
        }
        return (String[]) names.toArray(new String[names.size()]);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSuperuser() {
        return superuser;
    }

    public void setSuperuser(String superuser) {
        this.superuser = superuser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
