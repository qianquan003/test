package com.xi.countDemo;

import java.text.DecimalFormat;

/**
 * Created by Administrator on 2015/12/26.
 */
public class CountDemo {
    public static void main(String[] args) {
        Double a=11.11;
        Double b=1.11;
        DecimalFormat df=new DecimalFormat("#.00");
        Double d=Double.valueOf(df.format(a/b));
        System.out.println(d);
    }
}
