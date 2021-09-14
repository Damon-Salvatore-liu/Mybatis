package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description:
 *
 * @author liupengli
 * @date 2021/9/10 11:23 上午
 */
public class UserDaoTest {


    @Test
    public void getUserList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userlist = mapper.getUserList();
        for (User user : userlist) {
            System.out.println(user);
        }


        sqlSession.close();

    }


}