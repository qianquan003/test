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
        int a=24;
        int b=76339;
//        Double d=(Math.round((a/b)*10000)/10000.0);
        DecimalFormat df=new DecimalFormat("####.0000");
//        Double d=Double.valueOf(df.format((double)a/b));//��ʽ�����������3.0E-4
//        System.out.println(df.format((double)a/b));
        //��ʽ��С����λ��
        double cashFlow=23.43421;
        BigDecimal dou = new BigDecimal(cashFlow);
        double dcashFlow = dou.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(dcashFlow);
    }
}
