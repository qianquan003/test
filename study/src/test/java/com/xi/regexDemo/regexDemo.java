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
    String str = "古宜路（B）99弄2号1703室A室";
    public void pattern() {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(str);
        System.out.println("matcher:"+matcher);
        StringBuffer strB = new StringBuffer();
        String key = "";
        System.out.println(pattern.matcher(str).find());
        System.out.println("matcher.find():"+matcher.find());
        System.out.println("matcher.groupCount():"+matcher.groupCount());
        if(2>1){
            System.out.println(2);
        }else if(4>3){
            System.out.println(4);
        }
        if (pattern.matcher(str).find() && matcher.groupCount() == 1) {
            key = matcher.group(1);
            System.out.println("ok"+strB + key);
        }
        if (StringUtils.isNotBlank(key) && key.length() == 1) {
            System.out.println("key1:"+strB + key);
            indexId++;
            System.out.println("key2:"+strB + key);
        }
    }
    public void replace(String roomAddr,String b){
        roomAddr = roomAddr.replaceAll(b, "");
        System.out.println("roomAddr:"+roomAddr);
    }
    public static void main(String[] args) {
        new regexDemo().pattern();
//        String str = "江海新村(B)11幢134号301室A室";
//        System.out.println(Pattern.compile(REGEX).matcher(str).find());
//        if(Pattern.compile(REGEX).matcher(str).find()){
////            str.substring(str.indexOf("A室"),str.indexOf("A室")+1);
////            System.out.println(subStr(str));
//            str=subStr(str);
//            System.out.println(str);
//        }
//        new regexDemo().pattern();
        String a="江海新村(B)11幢134号301室A室";
        String b="江海新村(B)11幢134号301室";
        String c="A室";
        String d="好301室";
//        String a="东方路1881弄20号1001室G室";
//        String b="东方路1881弄20号1001室";
        new regexDemo().replace(SpecialCharReplace.StringFilter(a),SpecialCharReplace.StringFilter(d));
    }

    /**由于单元中的房间数量不多，所以写死
     * @param str
     * @return
     */
    public static String subStr(String str){
        if(str.contains("A室")){
            str="A";
        }
        if(str.contains("B室")){
            str="B";
        }
        if(str.contains("C室")){
            str="C";
        }
        if(str.contains("D室")){
            str="D";
        }
        if(str.contains("E室")){
            str="E";
        }
        if(str.contains("F室")){
            str="F";
        }
        if(str.contains("G室")){
            str="G";
        }
        if(str.contains("H室")){
            str="H";
        }
        if(str.contains("I室")){
            str="I";
        }
        if(str.contains("J室")){
            str="J";
        }
        if(str.contains("K室")){
            str="K";
        }
        return str;
    }
    /**由于单元中的房间数量不多，所以写死
     * @param str
     * @return
     */
    public static String findStr(String str,int size){
        if(size==2){
            if(str.contains("A")){
                str="B";
            }
            if(str.contains("B")){
                str="A";
            }
        }
        if(size==3){
            if(str.contains("A")&&str.contains("B")){
                str="C";
            }
            if(str.contains("B")&&str.contains("C")){
                str="A";
            }
            if(str.contains("A")&&str.contains("C")){
                str="B";
            }
        }
        if(size==4){
            if(str.contains("A")&&str.contains("B")&&str.contains("C")){
                str="D";
            }
            if(str.contains("A")&&str.contains("B")&&str.contains("D")){
                str="C";
            }
            if(str.contains("B")&&str.contains("C")&&str.contains("D")){
                str="A";
            }
            if(str.contains("A")&&str.contains("C")&&str.contains("D")){
                str="B";
            }
        }
        if(size==5){
            if(str.contains("A")&&str.contains("B")&&str.contains("C")&&str.contains("D")){
                str="E";
            }
            if(str.contains("A")&&str.contains("B")&&str.contains("C")&&str.contains("E")){
                str="D";
            }
            if(str.contains("A")&&str.contains("B")&&str.contains("D")&&str.contains("E")){
                str="C";
            }
            if(str.contains("A")&&str.contains("C")&&str.contains("D")&&str.contains("E")){
                str="B";
            }
            if(str.contains("B")&&str.contains("C")&&str.contains("D")&&str.contains("E")){
                str="A";
            }
        }
        if(size==6){
            if(str.contains("A")&&str.contains("B")&&str.contains("C")&&str.contains("D")&&str.contains("E")){
                str="F";
            }
            if(str.contains("A")&&str.contains("B")&&str.contains("C")&&str.contains("D")&&str.contains("F")){
                str="E";
            }
            if(str.contains("A")&&str.contains("B")&&str.contains("C")&&str.contains("E")&&str.contains("F")){
                str="D";
            }
            if(str.contains("A")&&str.contains("B")&&str.contains("D")&&str.contains("E")&&str.contains("F")){
                str="C";
            }
            if(str.contains("A")&&str.contains("C")&&str.contains("D")&&str.contains("E")&&str.contains("F")){
                str="B";
            }
            if(str.contains("B")&&str.contains("C")&&str.contains("D")&&str.contains("E")&&str.contains("F")){
                str="A";
            }
        }
        if(size==7){
            if(str.contains("B")&&str.contains("C")&&str.contains("D")&&str.contains("E")&&str.contains("F")&&str.contains("G")){
                str="A";
            }
            if(str.contains("A")&&str.contains("C")&&str.contains("D")&&str.contains("E")&&str.contains("F")&&str.contains("G")){
                str="B";
            }
            if(str.contains("B")&&str.contains("A")&&str.contains("D")&&str.contains("E")&&str.contains("F")&&str.contains("G")){
                str="C";
            }
            if(str.contains("B")&&str.contains("C")&&str.contains("A")&&str.contains("E")&&str.contains("F")&&str.contains("G")){
                str="D";
            }
            if(str.contains("B")&&str.contains("C")&&str.contains("D")&&str.contains("A")&&str.contains("F")&&str.contains("G")){
                str="E";
            }
            if(str.contains("B")&&str.contains("C")&&str.contains("D")&&str.contains("E")&&str.contains("A")&&str.contains("G")){
                str="F";
            }
            if(str.contains("B")&&str.contains("C")&&str.contains("D")&&str.contains("E")&&str.contains("F")&&str.contains("A")){
                str="G";
            }
        }
        return str;
    }
}
