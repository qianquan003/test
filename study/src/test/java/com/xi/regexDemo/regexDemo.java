package com.xi.regexDemo;

import org.apache.commons.lang.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/4/26.
 */
public class regexDemo {
    private static String REGEX = "([A-Z])室";
    private static Pattern pattern;
    private static Matcher matcher;
    int indexId = 0;
    String str = "";
    public void pattern() {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher("古宜路99弄2号1703室A室");
        System.out.println("matcher:"+matcher);
        StringBuffer strB = new StringBuffer();
        String key = "";
        if (matcher.find() && matcher.groupCount() > 1) {
            key = matcher.group(1);
            System.out.println("ok"+str + key);
        }
        if (StringUtils.isNotBlank(key) && key.length() == 1) {
            System.out.println("key1:"+str + key);
            indexId++;
            System.out.println("key2:"+str + key);
        }
    }
    public void replace(String roomAddr,String b){
        roomAddr = roomAddr.replaceAll(b, "");
        System.out.println("roomAddr:"+roomAddr);
    }
    public static void main(String[] args) {
//        new regexDemo().pattern();
        String a="江海新村(B)11幢134号301室A室";
        String b="江海新村(B)11幢134号301室";
        String c="A室";
//        String a="东方路1881弄20号1001室G室";
//        String b="东方路1881弄20号1001室";
        new regexDemo().replace(SpecialCharReplace.StringFilter(a),SpecialCharReplace.StringFilter(b));
    }
}
