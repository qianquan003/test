package com.xi.countDemo;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by Administrator on 2015/12/26.
 * java中，当两个整数相除时，由于小数点以后的数字会被截断，运算结果将为整数，此时若希望得到运算结果为浮点数，必须将两整数其一或是两者都强制转换为浮点数。
 例如：
 (float)a/b // 将整数其中一个强制转换为浮点数，再与另一个整数相除
 a/(float)b
 (float)a/(float)b // 将两个整数同时强制转换为浮点数后再相除
 Java代码
 float num= (float)2/3;
 DecimalFormat df = new DecimalFormat("0.00");//格式化小数
 String s = df.format(num);//返回的是String类型
 */
public class CountDemo {
    public static void main(String[] args) {
        Double a=1099.95;
        Double b=2100.00;
        Double d=a/b;
//        d = Math.floor(d*Math.pow(10,4))/Math.pow(10,4);//截取四位长度
//        Double d3=(Math.round((a/b)*10000)/10000.0);
        DecimalFormat df=new DecimalFormat("#.####");
        Double d2=Double.valueOf(df.format(d));//格式化后输出的是3.0E-4
        System.out.println(d2);
        //格式化小数点位数
//        double cashFlow=23.43421;
//        BigDecimal dou = new BigDecimal(cashFlow);
//        double dcashFlow = dou.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
//        System.out.println(dcashFlow);
    }
}
