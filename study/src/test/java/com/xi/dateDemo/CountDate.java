package com.xi.dateDemo;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2016/1/30.
 */
public class CountDate {
    public static void main(String[] args) {
        String date1="2015-10-18 00:00:00";
        String date2="2015-10-20 00:00:00";
        Date startTime=Timestamp.valueOf(date1);
        Date endTime=Timestamp.valueOf(date2);
        try{
            int count=daysBetween(startTime, endTime)+1;
            System.out.println(count);
        }catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
    public static int daysBetween(Date smdate, Date bdate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        smdate = sdf.parse(sdf.format(smdate));
        bdate = sdf.parse(sdf.format(bdate));
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / (1000 * 3600 * 24);

        return Integer.parseInt(String.valueOf(between_days));
    }
}
