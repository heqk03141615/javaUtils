package com.example.api.testMybatis.service;

import com.example.api.testMybatis.entity.Student;

import java.util.List;

/**
 * Created by XieZhiXin on 2018/8/8.
 */
public interface UserService {

    String getUserName(int stu_id);
    List<Student> getList(int stu_id);
}
