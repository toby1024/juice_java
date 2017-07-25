package cn.wufan.juice.mapper;

import cn.wufan.juice.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by zhangbin on 2017/7/20.
 */
@Mapper
public interface UserMapper {
    public Long save(User user);

    public List<User> findAll();

    public User findByUsername(String username);
}
