package com.xi.dateDemo;

/**
 * Created by Administrator on 2015/12/30.
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ListDate {
    public static void main(String[] args) {
//        System.out.println(new ListDate().queryDay());
        List list=new ListDate().queryDay();
        for(Object day:list){
            System.out.println(day);
        }
    }
    public List queryDay(){
        Calendar start = Calendar.getInstance();
        start.set(2014, 12, 1);
        Long startTIme = start.getTimeInMillis();

        Calendar end = Calendar.getInstance();
        end.set(2015, 11, 31);
        Long endTime = end.getTimeInMillis();

        Long oneDay = 1000 * 60 * 60 * 24l;

        Long time = startTIme;
        Date d =null;
        DateFormat df =null;
        List dateList=new ArrayList();
        while (time <= endTime) {
            d = new Date(time);
            df = new SimpleDateFormat("yyyy-MM-dd");
//            System.out.println(df.format(d));
            dateList.add(df.format(d));
            time += oneDay;
        }
        return dateList;
    }
}
