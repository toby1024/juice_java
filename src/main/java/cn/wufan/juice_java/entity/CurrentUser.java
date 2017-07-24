package cn.wufan.juice_java.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.*;

import java.util.Collection;
import java.util.List;

/**
 * Created by zhangbin on 2017/7/21.
 */
public class CurrentUser extends org.springframework.security.core.userdetails.User {

    private User user;

    public CurrentUser(User user) {
        super(user.getEmail(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getRoleNames()));
        this.user = user;
    }

    public String getSalt() {
        return user.getSalt();
    }
}
