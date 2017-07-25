package cn.wufan.juice.mapper;

import cn.wufan.juice.entity.Role;
import cn.wufan.juice.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Created by zhangbin on 2017/7/21.
 */
@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
public class UserRoleMapperTests {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findRolesByUserTest(){
        User user = new User("password","username", "email_address");
        userMapper.save(user);

        Role adminRole = new Role("Admin", 1);
        Role userRole = new Role("User", 1);
        userRoleMapper.saveRole(adminRole);
        userRoleMapper.saveRole(userRole);

        userRoleMapper.save(user.getId(), adminRole.getId());
        userRoleMapper.save(user.getId(), userRole.getId());

        List<Role> roles = userRoleMapper.findRolesByUser(user.getId());

        Assert.isTrue(roles.size() == 2, "user has 2 roles");
    }
}
