package com.example.api.testMybatis.service.impl;


import com.example.api.testMybatis.dao.UserMapper;
import com.example.api.testMybatis.entity.Student;
import com.example.api.testMybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by XieZhiXin on 2018/8/8.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapperDao;

    @Override
    public String getUserName(int stu_id)
    {
        String  name=userMapperDao.getUserNameById(stu_id);
        return name;
    }

    @Override
    public List<Student> getList(int stu_id)
    {

        return userMapperDao.getList(stu_id);
    }
}
