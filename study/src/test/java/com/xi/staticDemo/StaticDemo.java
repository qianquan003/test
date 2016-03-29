package com.xi.staticDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/3/29.
 */
public class StaticDemo {
    public StaticDemo() {
        System.out.println("构造函数");
    }

    static {
        System.out.println("static{}只执行一次");
    }
    public static Map map;
    static{
        map = new HashMap();
        map.put("a", "priceFrom");
        map.put("b", "priceTo");
        map.put("c", "priceId");
        map.put("d", "zone");
        map.put("e", "subway");
        map.put("f", "station");
        map.put("g", "romType");
        map.put("h", "roomCode");
        map.put("i", "romAds");
        map.put("j", "cellArea");
        map.put("k", "currentPage");
        map.put("l", "pageSize");
        map.put("m", "orderByField");
        map.put("n", "sortDirection");

    }
    public static int X=300;
    static{
        System.out.println(X);
        X=200;
        System.out.println(X);
    }
    public static void main(String[] args) {
//        StaticDemo sd=new StaticDemo();
//        StaticDemo sd2=new StaticDemo();
//        System.out.println(map.get("a"));
        System.out.println(StaticDemo.map);
//        try {
//            Class.forName("StaticDemo");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
