package cn.wufan.juice.mapper;

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
 * Created by zhangbin on 2017/7/20.
 */
@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
public class UserMapperTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findALlTest(){
        User user = new User("password","username", "email_address");
        userMapper.save(user);

        List<User> users = userMapper.findAll();

        System.out.println(users.size());
        System.out.println("=========>");
        Assert.isTrue(users.size() == 1, "user total count must be 1");
        Assert.isTrue(users.get(0).getEmail().equals("email_address"), "user email must be equals email address");
    }

    @Test
    public void findByUsername(){
        User user = new User("password","username", "email_address");
        userMapper.save(user);

        User findUser = userMapper.findByUsername("username");
        Assert.isTrue(findUser.getEmail().equals("email_address"), "must find user by username");
        User canNotFindUser = userMapper.findByUsername("test");
        Assert.isNull(canNotFindUser, "must can not find user");
    }
}
