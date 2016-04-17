package com.xi.ioDemo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * 把一个文件中的内容读出，把大写字母转换成小写字母后输出到另一个文件中

 */
public class Tset2 {
	public static void main(String[] args) {
		String s = "E:\\java\\document\\tel.json";

		try {
			FileInputStream	fis = new FileInputStream(new File(s));
			InputStreamReader ipsr = new InputStreamReader(fis,"utf-8");
			BufferedReader br = new BufferedReader(ipsr);

			String s1 = "E:\\java\\document\\111.txt";
			FileOutputStream fos = new FileOutputStream(new File(s1));
			OutputStreamWriter opsw = new OutputStreamWriter(fos,"utf-8");
			BufferedWriter bw = new BufferedWriter(opsw);

			String line = null;
			while((line = br.readLine()) != null){
				bw.append(line.toLowerCase()).append("\r\n");
			}
			bw.close();
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}