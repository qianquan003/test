package com.xi.ListDemo;

import com.xi.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/3.
 */
public class ListEntityDemo {
    public void entity(){
        List<Student> list=new ArrayList<Student>();
        Student student=new Student();
        student.setId(1);
        student.setAge(22);
        student.setName("test");
        student.setSex("男");
        Student student2=new Student();
        student2.setId(2);
        student2.setAge(18);
        student2.setName("nv");
        student2.setSex("女");
        list.add(student);
        list.add(student2);
        list.remove(0);
        for(Student s:list){
            System.out.println("s:"+s.getName());
        }
    }

    public static void main(String[] args) {
        new ListEntityDemo().entity();
    }
}
