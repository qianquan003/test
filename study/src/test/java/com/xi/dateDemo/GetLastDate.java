package com.xi.dateDemo;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Administrator on 2016/3/15.
 */
public class GetLastDate {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.add(Calendar.DATE,-1);
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(df.format(c.getTime()));
    }
}
