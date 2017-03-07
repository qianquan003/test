package com.xi.arrayDemo;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/2/25.
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //배열声明一个数组
//        String[] aArray = new String[5];
//        String[] bArray = {"a","b","c", "d", "e"};
//        String[] cArray = new String[]{"a","b","c","d","e"};
//        System.out.println(aArray[0]);
//        System.out.println(bArray[2]);
//        System.out.println(cArray[3]);
        // 输出一个数组
//        int[] intArray = {1, 2, 3, 4, 5};
//        String intArrayString = Arrays.toString(intArray);
//        // print directly will print reference value
//        System.out.println(intArray);
//        // [I@7150bd4d
//        System.out.println(intArrayString);
        //从一个数组创建数组列表
//        String[] stringArray = { "a", "b", "c", "d", "e" };
//        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
//        System.out.println(arrayList);
        // 检查一个数组是否包含某个值
//        String[] stringArray = { "a", "b", "c", "d", "e" };
//        String str="m";
//        boolean b = Arrays.asList(stringArray).contains(str);
//        System.out.println(b);
//        if(b==true){
//            System.out.println("包含"+str);
//        }else{
//            System.out.println("不包含"+str);
//        }
        //连接两个数组
//        int[] intArray = { 1, 2, 3, 4, 5 };
//        int[] intArray2 = { 6, 7, 8, 9, 10 };
//        // Apache Commons Lang library
//        int[] combinedIntArray = ArrayUtils.addAll(intArray, intArray2);
//        String intArrayString = Arrays.toString(combinedIntArray);
//        System.out.println(intArrayString);
        //声明一个内联数组（Array inline）
//        method(new String[]{"a", "b", "c", "d", "e"});
        //把提供的数组元素放入一个字符串
//        String j = StringUtils.join(new String[]{"a", "b", "c"}, ", ");
//        System.out.println(j);
        //将一个数组列表转换为数组
        /*String[] stringArray = { "a", "b", "c", "d", "e","a" };
        System.out.println("arraylength:"+stringArray.length);
        String str="hello";
        System.out.println("stringlength:"+str.length());
        Set set=new HashSet();
        set.add(stringArray);
        System.out.println(set.iterator());*/
//        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
//        String[] stringArr = new String[arrayList.size()];
//        arrayList.toArray(stringArr);
//        for (String s : stringArr)
//            System.out.println(s);
        //将一个数组转换为集（set）
//        Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
//        System.out.println(set);
        //逆向一个数组
//        int[] intArray = { 1, 2, 3, 4, 5 };
//        ArrayUtils.reverse(intArray);
//        System.out.println(Arrays.toString(intArray));
        //移除数组中的元素
//        int[] intArray = { 1, 2, 3, 4, 5 };
//        int[] removed = ArrayUtils.removeElement(intArray, 3);//create a new array
//        System.out.println(Arrays.toString(removed));
        //将整数转换为字节数组
//        byte[] bytes = ByteBuffer.allocate(4).putInt(8).array();
//        for (byte t : bytes) {
//            System.out.format("0x%x ", t);
//        }
        //二维矩阵转至
        /*int[][] a={{1,2,3,4},{2,3,4,5},{3,4,5,6}};
        int[][] b=new int[4][3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                b[j][i]=a[i][j];
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }*/
    }
}
