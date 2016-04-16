package com.xi.studyDemo;

/**
 * Created by Administrator on 2016/3/15.
 */
public class Gongshi {
    public static void main(String[] args) {
        System.out.println(method(5));
    }
    public static int method(int i){
        int sum=0;
        for(int j=0;j<i;j++){
            sum+=Math.pow(10,j)*(i-j)*i;
        }
        return sum;
    }
}
