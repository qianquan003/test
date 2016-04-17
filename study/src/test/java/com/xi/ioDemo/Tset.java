package com.xi.ioDemo;

import java.io.File;

/**
 * 1、遍历你电脑任一文件夹内容
 */
public class Tset {
	public static void main(String[] args) {
		File f=new File("E:\\java\\document");
		try{
			File1(f);
		}catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void File1(File f2){
		//先输出文件
		String[] names = f2.getName().split("[.]");
		System.out.println(f2.getName()
				+ "       "+names[names.length-1]+" 文件"
				+ "       "+f2.length());
		if(f2.isDirectory()){  //判断是否为目录
			File[] files = f2.listFiles();  //获取目录下文件列表
			for(File f:files){//递归输出文件
				File1(f);
			}

		}
	}
}