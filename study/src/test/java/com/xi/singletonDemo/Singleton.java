package com.xi.singletonDemo;

/**
 * Created by Administrator on 2016/2/29.
 */
public class Singleton {
    //第一种形式
    //私有构造函数
    private Singleton(){};
    private static Singleton singleton=new Singleton();//实例化类【私有化】
    public static Singleton getSingleton(){
        System.out.println("单例模式");
        return singleton;
    }
    //第二种形式
    private static Singleton init=null;
    public static synchronized Singleton getInit(){
        //使用时生成实例
        if(init==null){
            System.out.println("使用时生成实例");
            init=new Singleton();
        }
        return init;
    }
    public static void main(String[] args) {
        Singleton.getSingleton();
        Singleton.getInit();
    }
}
