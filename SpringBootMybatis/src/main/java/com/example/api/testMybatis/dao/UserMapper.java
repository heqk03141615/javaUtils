package com.example.api.testMybatis.dao;

import com.example.api.testMybatis.entity.Student;

import java.util.List;

/**
 * Created by XieZhiXin on 2018/8/8.
 */
public interface UserMapper {

    String getUserNameById(int stu_id);

    List<Student> getList(int stu_id);
}
