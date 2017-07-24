package cn.wufan.juice_java.service.currentuser;

import cn.wufan.juice_java.entity.CurrentUser;
import cn.wufan.juice_java.entity.Role;
import cn.wufan.juice_java.entity.User;
import cn.wufan.juice_java.mapper.UserMapper;
import cn.wufan.juice_java.mapper.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by zhangbin on 2017/7/21.
 */
@Service
public class CurrentUserDetailsService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.findByUsername(username);
        List<Role> roleList = userRoleMapper.findRolesByUser(user.getId());
        user.setRoles(roleList);

        return new CurrentUser(user);
    }
}
