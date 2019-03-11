package com.example.api.testMybatis.entity;

public class Student {

    private Integer id;

    private String stu_name;

    private String sex;

    private String age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getStu_name() {

        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }
}
