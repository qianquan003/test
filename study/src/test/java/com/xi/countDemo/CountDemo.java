package com.xi.countDemo;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by Administrator on 2015/12/26.
 * java�У��������������ʱ������С�����Ժ�����ֻᱻ�ضϣ���������Ϊ��������ʱ��ϣ���õ�������Ϊ�����������뽫��������һ�������߶�ǿ��ת��Ϊ��������
 ���磺
 (float)a/b // ����������һ��ǿ��ת��Ϊ��������������һ���������
 a/(float)b
 (float)a/(float)b // ����������ͬʱǿ��ת��Ϊ�������������
 Java����
 float num= (float)2/3;
 DecimalFormat df = new DecimalFormat("0.00");//��ʽ��С��
 String s = df.format(num);//���ص���String����
 */
public class CountDemo {
    public static void main(String[] args) {
        Double a=1099.95;
        Double b=2100.00;
        Double d=a/b;
//        d = Math.floor(d*Math.pow(10,4))/Math.pow(10,4);//��ȡ��λ����
//        Double d3=(Math.round((a/b)*10000)/10000.0);
        DecimalFormat df=new DecimalFormat("#.####");
        Double d2=Double.valueOf(df.format(d));//��ʽ�����������3.0E-4
        System.out.println(d2);
        //��ʽ��С����λ��
//        double cashFlow=23.43421;
//        BigDecimal dou = new BigDecimal(cashFlow);
//        double dcashFlow = dou.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
//        System.out.println(dcashFlow);
    }
}
