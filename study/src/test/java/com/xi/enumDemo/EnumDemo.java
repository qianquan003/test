package com.xi.enumDemo;

/**
 * Created by xisir on 2015/12/27.
 */
public enum EnumDemo {
    RED("³à¤¤",1),GREEN("??",2),BLUE("ìi¤¤",3);
    private String color;
    private int index;
    private EnumDemo(String color,int index){
        this.color=color;
        this.index=index;
    }
    public String toString(){
        return this.color;
    }
    public static void main(String[] args){
        System.out.println(EnumDemo.RED);
        EnumDemo[] e=EnumDemo.values();
        System.out.println(e[0] instanceof EnumDemo);
        EnumDemo blue=EnumDemo.valueOf(EnumDemo.class,"BLUE");
        System.out.println(blue);//or blue.color
    }
}
