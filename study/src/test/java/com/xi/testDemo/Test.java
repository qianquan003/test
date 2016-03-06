package com.xi.testDemo;

import java.util.*;

/**
 * Created by Administrator on 2015/12/21.
 */
public class Test {
    public static void main(String[] args) {
        List<Object[]> incomeList = new ArrayList();
        incomeList.add(new Object[]{1, "2015-10-11", "LZL-980-2-402-D-20120511", 22.11, 122.22, 0, 0});
        incomeList.add(new Object[]{2, "2015-10-12", "GYL-99-6-602-D-20120511", 55.55, 144.00, 0, 0});
        incomeList.add(new Object[]{3, "2015-10-13", "GYL-99-6-602-D-20120511", 42.00, 146.00, 0, 0});
        List<Object[]> costList = new ArrayList();
        costList.add(new Object[]{1, "2015-10-11", "", 0, 0, 10.10, 20.22});
        costList.add(new Object[]{2, "2015-10-12", "", 0, 0, 54.11, 33.33});
        costList.add(new Object[]{3, "2015-10-13", "", 0, 0, 26.21, 32.00});
    }
    //0,1,1,2,3,5,8,13.。。写出第10个数是多少
}
