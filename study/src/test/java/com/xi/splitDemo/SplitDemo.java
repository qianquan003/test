package com.xi.splitDemo;

/**
 * Created by Administrator on 2016/4/7.
 */
public class SplitDemo {
    public static void main(String[] args) {
        String tel="400 1737 365";
        if (tel!=null&&tel.indexOf(" ") != -1) {
            String[] strKey = tel.split(" ");
            String str1=strKey[0];
            String str2=strKey[1];
            String str3=strKey[2];
            System.out.println(str1+"-"+str2+"-"+str3);
        }
    }
}
