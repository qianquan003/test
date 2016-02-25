package com.xi.main;

import com.xi.ListDemo.MergeList;

import java.text.DecimalFormat;

/**
 * Created by Administrator on 2015/12/26.
 */
public class Execute {
    public static void main(String[] args) {
//        MergeList ml=new MergeList();
//        ml.queryList();
//        Integer vacantRoom=671;
//        Integer allRoom=1472;
//        Double vacancy_rate = Double.valueOf((double) vacantRoom / allRoom);
//        DecimalFormat df = new DecimalFormat("#.0000");
//        Double d = Double.valueOf(df.format(vacancy_rate));
//        System.out.println(d);
//        for(int i=1;i<101;i++){
//            System.out.println(i);
//        }
        /*int i=1;
        while(i<101){
            System.out.println(i);
            i++;
        }*/
//        int i=0;
//        do{
////            i=1;
//            i++;
//            System.out.println(i);
//        }while(i<100);
        /*Integer score=-19;
        if(score>=0&&score<60){
            System.out.println("不及格");
        }
        if(score>=60&&score<80){
            System.out.println("合格");
        }
        if(score>=80&&score<90){
            System.out.println("良");
        }
        if(score>=90&&score<=100){
            System.out.println("优秀");
        }
        else if(score<0||score>100){
            System.out.println("非法成绩");
        }*/
        //分级打印的例子 0-59不及格 60-79合格 80-89 良 90 -100优秀 否则 非法成绩
        /*Integer score=90;
        char sc='E';//用A表示优秀 B良 C合格 D不及格
        if(score>=0&&score<60){
            sc='D';
        }
        if(score>=60&&score<80){
            sc='C';
        }
        if(score>=80&&score<90){
            sc='B';
        }
        if(score>=90&&score<=100){
            sc='A';
        }
        else if(score<0||score>100){
            sc='E';
        }
        switch (sc){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良");
                break;
            case 'C':
                System.out.println("合格");
                break;
            case 'D':
                System.out.println("不及格");
                break;
            default:
                System.out.println("非法成绩");
                break;
        }*/
        int result = 991;
        if (result >= 0 && result <= 59) {
            System.out.println("不合格");
        } else if (result >= 60 && result <= 79) {
            System.out.println("合格");
        } else if (result >= 80 && result <= 89) {
            System.out.println("良好");
        } else if (result >= 90 && result <= 100) {
            System.out.println("优秀");
        } else {
            System.out.println("非法成绩");
        }
    }
}
