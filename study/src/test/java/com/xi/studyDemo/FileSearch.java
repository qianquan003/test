package com.xi.studyDemo;

import java.io.File;

/**
 * Java遍历指定文件夹，在屏幕打印所有以abc结尾的文件
 * 思路:首先定义一个方法，传入参数是要搜索的文件夹和要匹配的末尾的字符串,此题我们传入abc
 (1)首先查找传入的文件夹，列出他下面所属的所有文件和目录
 (2)然后遍历这些目录和文件，判断哪些是目录，哪些是文件
 (3)如果是文件，就看是否匹配某位以abc结尾，如果是就输出
 (4)如果是文件夹，就继续按(1)-(3)步骤递归
 */
public class FileSearch {

    
    public void findFileByEndStr(String dirStr, String str) {
        if (null == dirStr) {
            throw new RuntimeException("要搜索的目录名不能为null");
        }
        File dir = new File(dirStr);
        if (!dir.exists()) {
            throw new RuntimeException(dirStr + "is not existed!");
        }

        if (null == str) {
            throw new RuntimeException("要匹配的末尾不能为null");
        }

        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile() && file.toString().endsWith(str)) {
                System.out.println("文件名:" + file.getName() + "\t\t绝对路径:"
                        + file.toString());

            }
            if (file.isDirectory()) {
                findFileByEndStr(file.toString(), str);

            }

        }

    }

    public static void main(String[] args) {

        new FileSearch().findFileByEndStr("D:\\xm\\study\\", "");

    }

}