package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * Description:
 *
 * @author liupengli
 * @date 2021/9/10 10:36 上午
 */
public interface UserMapper {

    //模糊查询
    List<User> getUserLike(String value);
    //查询全部用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
    //insert一个用户
    int addUser(User user);

    //万能map
    int addUser2(Map<String,Object> map);


    //update一个用户
    int updateUser(User user);
    //delete一个用户
    int deleteUser(int id);
}
