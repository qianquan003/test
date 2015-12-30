package com.xi.dateDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/12/30.
 */
public class ListMonth {
    public static void main(String[] args) {
        //list every month
//        System.out.println(new ListMonth().queryMonth());
        List list=new ListMonth().queryMonth();
        for(Object month:list){
            System.out.println(month.toString());
        }
    }
    public List queryMonth(){
        List dateList=new ArrayList();
        dateList.add("2015-01");
        dateList.add("2015-02");
        dateList.add("2015-03");
        dateList.add("2015-04");
        dateList.add("2015-05");
        dateList.add("2015-06");
        dateList.add("2015-07");
        dateList.add("2015-08");
        dateList.add("2015-09");
        dateList.add("2015-10");
        dateList.add("2015-11");
        dateList.add("2015-12");
        return dateList;
    }
}
