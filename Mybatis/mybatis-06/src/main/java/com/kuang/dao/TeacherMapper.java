package com.kuang.dao;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Description:
 *
 * @author liupengli
 * @date 2021/9/12 10:17 上午
 */
public interface TeacherMapper {
    @Select("select * from mybatis.teacher where id=#{tid}")
    Teacher getTeacher(@Param("tid") int id);
}
