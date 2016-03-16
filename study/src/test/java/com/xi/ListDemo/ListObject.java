package com.xi.ListDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/1/14.
 */
public class ListObject {
    public static void main(String[] args) {
        removeString();
        /*List<Object[]> userList = new ArrayList<Object[]>();
        userList.add(new Object[]{2});
        if (userList.get(0) != null) {
            Integer userTotal = Integer.valueOf(userList.get(0)[0].toString());
            System.out.println(userTotal);
        }*/
    }

    //移除list长度为3的元素
    public static void removeString() {
        List list = new ArrayList();
        list.add("中国");
        list.add("上海");
        list.add("哈尔滨");
        list.add("石家庄");
        list.add("乌鲁木齐");
        remove(list);
        for(Object obj:list){
            System.out.println(obj);
        }
    }

//    public static void remove(List<String> list) {
//        Iterator<String> it=list.iterator();
//        while(it.hasNext()){
//            String str=it.next();
//            if(str.length()==3){
//                it.remove();
//            }
//        }
//    }
    public static void remove(List<String> list){
        for(int i=list.size()-1;i>0;i--){
            if(list.get(i).length()==3){
                list.remove(i);
            }
        }
    }
}
