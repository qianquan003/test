package com.xi.ListDemo;

import com.xi.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xisir on 2016/4/16.
 */
public class ObjectToStringDemo {
    public void ObjectToString(){
        Student s=new Student();
        s.setName("test");
        List<Student> list=new ArrayList<Student>();
        list.add(new Student());
        System.out.println("jhjh:" + list.size());
        List<String> ls=new ArrayList<String>();
    }
    public static void main(String[] args) {
        ObjectToStringDemo osd=new ObjectToStringDemo();
        osd.ObjectToString();
    }
}
