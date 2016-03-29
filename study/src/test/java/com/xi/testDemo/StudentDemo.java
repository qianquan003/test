package com.xi.testDemo;

import com.xi.model.Student;

import java.util.Scanner;

/**
 * 再做一题：录入学生信息学号姓名性别年龄并显示录入信息
 *升级功能：判断录入是否合法（学号必为4位整数），录入合法，显示录入的信息；不合法，显示“录入失败”
 *再次升级：算出学号中在百位的数字号码
 * Created by Administrator on 2016/3/29.
 */
public class StudentDemo {
    Student student=new Student();
    public void method1(){
        Scanner num=new Scanner(System.in);
        System.out.println("请在控制台输入学生学号：");
        student.setNum(num.nextInt()+"");
        System.out.println("输入的学生学号："+student.getNum());

        Scanner name=new Scanner(System.in);
        System.out.println("请在控制台输入学生姓名：");
        student.setName(name.next());
        System.out.println("输入的学生姓名："+student.getName());

        Scanner sex=new Scanner(System.in);
        System.out.println("请在控制台输入学生性别：");
        student.setSex(sex.next());
        System.out.println("输入的学生性别："+student.getSex());

        Scanner age=new Scanner(System.in);
        System.out.println("请在控制台输入学生年龄：");
        student.setAge(age.nextInt());
        System.out.println("输入的学生年龄：" + student.getAge());
    }
    public void method2(){

    }
    public void method3(){

    }
    public static void main(String[] args) {
        new StudentDemo().method1();
    }
}
