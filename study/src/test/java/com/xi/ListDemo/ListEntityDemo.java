package com.xi.ListDemo;

import com.xi.model.Student;

import java.util.*;

/**
 * Created by Administrator on 2016/5/3.
 */
public class ListEntityDemo {
    public void entity() {
        List<Student> list = new ArrayList<Student>();
        Student student = new Student();
        student.setId(1);
        student.setAge(22);
        student.setName("test");
        student.setSex("男");
        Student student2 = new Student();
        student2.setId(2);
        student2.setAge(18);
        student2.setName("nv");
        student2.setSex("女");
        list.add(student);
        list.add(student2);
//        list.remove(0);
//        for(Student s:list){
//            System.out.println("s:"+s.getName());
//        }
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println("s2:" + s.getName());
            if (s.getSex().equals("女")) {
                it.remove();
            }
            System.out.println("s3:" + it.next().getName());
        }
    }

    public void mapList() {
        Map<Object, String> map = new HashMap<Object, String>();
        map.put("test", "test");
        map.put("test2", "test2");
        map.put("test3", "test3");
        map.put("test4", "test4");
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<Object, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

    }

    public void check() {
        boolean b = 81 >= 9*9;
        if (b) {
            System.out.println("ok");
        }
    }

    public static void main(String[] args) {
//        new ListEntityDemo().entity();
//        new ListEntityDemo().mapList();
        new ListEntityDemo().check();
    }
}
