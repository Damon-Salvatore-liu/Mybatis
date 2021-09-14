package com.kuang.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Description:
 *
 * @author liupengli
 * @date 2021/9/10 10:08 上午
 */

//SqlSessionFactory --> SqlSession
public class MybatisUtils {

    private  static  SqlSessionFactory sqlSessionFactory;
    static {
        try {

            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession(true);

    }


}
