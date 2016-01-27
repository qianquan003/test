package com.xi.dateDemo;

/**
 * Created by Administrator on 2016/1/27.
 */
public class SubDay {
    public static void main(String[] args) {
        String day="2015-02-10";
        System.out.println(checkMonth(day));
    }
    public static int checkMonth(String day){
        Integer days=0;
        if(day.substring(5,7).equals("01")){
            days=31;
        }
        if(day.substring(5,7).equals("02")){
            days=28;
        }
        if(day.substring(5,7).equals("03")){
            days=31;
        }
        if(day.substring(5,7).equals("04")){
            days=30;
        }
        if(day.substring(5,7).equals("05")){
            days=31;
        }
        if(day.substring(5,7).equals("06")){
            days=30;
        }
        if(day.substring(5,7).equals("07")){
            days=31;
        }
        if(day.substring(5,7).equals("08")){
            days=31;
        }
        if(day.substring(5,7).equals("09")){
            days=30;
        }
        if(day.substring(5,7).equals("10")){
            days=31;
        }
        if(day.substring(5,7).equals("11")){
            days=30;
        }
        if(day.substring(5,7).equals("12")){
            days=31;
        }
        return days;
    }
}
