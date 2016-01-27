package com.xi.ListDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/1/14.
 */
public class ListObject {
    public static void main(String[] args) {
        List<Object[]> userList = new ArrayList<Object[]>();
        userList.add(new Object[]{2});
        if(userList.get(0)!=null) {
            Integer userTotal = Integer.valueOf(userList.get(0)[0].toString());
            System.out.println(userTotal);
        }
    }
}
