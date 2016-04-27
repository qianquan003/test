package com.xi.regexDemo;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/4/27.
 */
public class TestRegex {
    private static String REGEX = "([A-Z])室";
    private static Pattern pattern;
    private static Matcher matcher;
    List list=new ArrayList();
    Map map=new HashMap();
    public void test(){
//        Map<String,String> map=new HashMap<String,String>();
//        map.put("海蓝路98弄13号101室A室2N","海蓝路98弄13号101室A室2N");
//        map.put("海蓝路98弄13号101室C室2N","海蓝路98弄13号101室C室2N");
//        map.put("海蓝路98弄13号101室D室2N","海蓝路98弄13号101室D室2N");
//        for(String str:map.keySet()){
//            System.out.println(str);
//        }
        List<Object[]> incomeList=new ArrayList<Object[]>();
        incomeList.add(new Object[]{1, "2015-10-11", 1, "海蓝路98弄13号101室A室2N", 22.11, 0});
        incomeList.add(new Object[]{2, "2015-10-12", 2, "海蓝路98弄13号101室2N", 55.55, 0});
        incomeList.add(new Object[]{2, "2015-10-12", 2, "海蓝路98弄13号101室C室2N", 55.55, 0});
        incomeList.add(new Object[]{3, "2015-10-13", 3, "海蓝路98弄13号101室D室2N", 42.00, 0});
        for(Object[] income:incomeList){
            String add=income[3].toString();
//            System.out.println(add);
            pattern = Pattern.compile(REGEX);
            matcher = pattern.matcher(add);
            StringBuffer strB = new StringBuffer();
            String key = "";
            map.put("flag","flag");
            if (matcher.find() && matcher.groupCount() == 1) {
                key = matcher.group(1);

                System.out.println("ok:"+strB + key);

//                System.out.println(incomeList.size());
                list.add(key);
//                regexDemo.findStr(key,incomeList.size());
            }
        }
        System.out.println(map.get("flag"));
        String word="";
        for(Object obj:list){
           word+=obj.toString();
        }
        System.out.println(word);
        System.out.println(regexDemo.findStr(word,incomeList.size()));
    }

    public static void main(String[] args) {
        new TestRegex().test();
    }
}
