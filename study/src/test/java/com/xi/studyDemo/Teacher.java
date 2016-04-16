package com.xi.studyDemo;

public class Teacher extends Person {
     String name = "tom";

    public Teacher() {
        super();//在子类构造方法中使用super（）显示调用父类的构造方法，super（）必须写在子类构造方法的第一行，否则编译不通过
        System.out.println("this is a teacher");
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println(teacher.name);//this（）不能在static环境中使用
    }
}