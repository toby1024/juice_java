package cn.wufan.juice.service;

import cn.wufan.juice.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangbin on 2017/7/20.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

}
