package com.xi.studyDemo;

import java.util.StringTokenizer;

/**
 * Created by Administrator on 2016/3/1.
 */
public class StudyDemo {
    //有一个方法，传进一个字符串和拆分符，根据拆分符返回一个String[]，不能用split()
    //(如传入String s = "abc-eee-ppp" 返回[“abc”,” eee”,” ppp”])
    public void myMethod(String str){
//        String s = "abc-eee-ppp" ;
        String[] split=str.split("-");
        for(String a:split){
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
//        StudyDemo sd=new StudyDemo();
//        String s = "abc-eee-ppp" ;
//        sd.myMethod(s);
        String s = "abc-eee-ppp";
        String[] strs  = getArray(s,"-");
        for(String ss :strs){
            System.out.println(ss);
        }
    }
    public static String[] getArray(String s,String mark) {
        StringTokenizer st = new StringTokenizer(s,mark);
        int count =  st.countTokens();
        String[] strs = new String[count];
        int i = 0;
        while(st.hasMoreElements()){
            strs[i] = (String)st.nextElement();
            i ++;
        }
        return strs;
    }
}
