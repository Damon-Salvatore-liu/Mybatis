package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Description:
 *
 * @author liupengli
 * @date 2021/9/10 10:36 上午
 */
public interface UserMapper {

    @Select("select * from mybatis.user")
    List<User> getUsers();

    @Select("select * from mybatis.user where id = #{id}")
    User getUserByID(@Param("id")int id);

}
