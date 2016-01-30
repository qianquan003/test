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
        Integer vacantRoom=671;
        Integer allRoom=1472;
        Double vacancy_rate = Double.valueOf((double) vacantRoom / allRoom);
        DecimalFormat df = new DecimalFormat("#.0000");
        Double d = Double.valueOf(df.format(vacancy_rate));
        System.out.println(d);
    }
}
