package com.xi.regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/*
 * 字符串"$ \"中的$与\字符互换位置 
 */
public class SpecialCharReplace {
    public static void main(String[] args) {
//        String str = "江海新村(B)11幢134号301室A室";
//        System.out.println(str.replaceAll("江海新村(B)11幢134号301室", ""));
////        String str = "*adCVs*34_a _09_b5*[/435^*&城池()^$$&*).{}+.|.)%%*(*.中国}34{45[]12.fd'*&999下面是中文的字符￥……{}【】。，；’“‘”？";
////        System.out.println(str);
//        System.out.println(StringFilter(str));
        System.out.println (compare ("C室1SY", "1SY"));
    }

    public static String StringFilter(String str) throws PatternSyntaxException {
        // 只允许字母和数字
        // String   regEx  =  "[^a-zA-Z0-9]";
        // 清除掉所有特殊字符
        String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("").trim();
    }

    /**比较两个字符串中是否有相同元素
     * @param f
     * @param s
     * @return
     */
    private static String  compare(String f, String s) {
        int count = 0;
        String str="";//相同元素
        String str2="";//不同元素
        for (int i = 0; i < f.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (f.charAt(i) == s.charAt(j)) {
                    count++;
                    str+=f.charAt(i);
                }
            }
        }
        char[] a1 = f.toCharArray();
        char[] b1 = s.toCharArray();
        int c = a1.length<b1.length? a1.length:b1.length;
        for(int i=0;i<c-1;i++){
            if(a1[i]!=b1[i]){
                str2+=f.charAt(i);
//                break;
            }
        }
        return str2;
    }
}   