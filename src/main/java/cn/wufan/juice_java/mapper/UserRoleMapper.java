package cn.wufan.juice_java.mapper;

import cn.wufan.juice_java.entity.Role;
import cn.wufan.juice_java.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhangbin on 2017/7/21.
 */
@Mapper
public interface UserRoleMapper {

    public List<Role> findRolesByUser(Long userId);

    public Long saveRole(Role role);

    public Long save(@Param("userId") Long userId, @Param("roleId") Long roleId);

}
