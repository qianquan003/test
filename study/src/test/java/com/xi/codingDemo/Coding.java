package com.xi.codingDemo;

/**
 * Created by Administrator on 2016/2/29.
 */
public class Coding {
    private Coding(){};
    private static Coding coding=new Coding();
    public static Coding getCoding(String str){
        String s=null;
        try {
            s = new String(str.getBytes("gbk"), "gbk").trim();
            System.out.println("str:"+s);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        return coding;
    }
    public static Coding getCoding(String str1,String str2){
        String s=null;
        try {
            s = new String(str1.getBytes("gbk"), "gbk").trim();
            System.out.println("str:"+s);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        return coding;
    }
    public static void main(String[] args) {
        Coding.getCoding("你好！");
    }
}
