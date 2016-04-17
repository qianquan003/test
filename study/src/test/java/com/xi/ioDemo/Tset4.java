package com.xi.ioDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 3、 在文本文件book.txt中包含有很长篇幅的英语短文，编写程序要求统计文件的所有短文中包含英文字母“A”的个数

 */
public class Tset4 {
	public static void main(String[] args) {
		try {
			File f=new File("E:\\java\\document\\tel.json");
			FileInputStream fis=new FileInputStream(f);
			int count=0;
			int i=0;

			while((i=fis.read())!=-1){
				if(i=='A'){
					count++;
				}

			}
			System.out.println("字母A的个数为"+count);
		} catch (

				Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}