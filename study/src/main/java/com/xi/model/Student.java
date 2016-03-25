package com.xi.model;

/**
 * Created by Administrator on 2016/3/25.
 */
public class Student {
    private long id;
    private String num;
    private String name;
    private String sex;
    private int age;

    public Student() {
    }

    public Student(long id, String num, String name, String sex, int age) {
        this.id = id;
        this.num = num;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
