package com.kuang.pojo;

import lombok.Data;

/**
 * Description:
 *
 * @author liupengli
 * @date 2021/9/12 10:13 上午
 */
@Data
public class Student {
    private int id;
    private String name;
    //多个学生可以是同一个老师，即多对一
    private Teacher teacher;
}


