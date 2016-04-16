package com.xi.jiheDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Administrator on 2016/3/21.
 */
public class UserComparator implements Comparator<User> {

    public int compare(User u1, User u2) {
        if(u1.equals(u2)) {
            return 0;
        }else if(u1.getAge()<u2.getAge()){//u1.getAge()>u2.getAge()按年龄从小到大排序
            return 1;
        }else if(u1.getAge()==u2.getAge()){
            int f=u1.getName().compareTo(u2.getName());
            if(f<0){
                return -1;
            }
            return 0;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        List<User> list=new ArrayList<User>();
        list.add(new User(25,"z"));
        list.add(new User(26,"x"));
        list.add(new User(28,"d"));
        list.add(new User(26,"f"));
        list.add(new User(25,"w"));
        list.add(new User(23,"z"));
        UserComparator uc=new UserComparator();
        Collections.sort(list,uc);
        for(User u:list){
            System.out.println(u);
        }
    }
}
