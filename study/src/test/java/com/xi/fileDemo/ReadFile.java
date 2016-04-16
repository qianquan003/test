package com.xi.fileDemo;

import java.io.*;

/**
 * Created by Administrator on 2016/3/18.
 */
public class ReadFile {
    public static void writefileChar() throws Exception{
        FileWriter fw=new FileWriter("D:\\logFile.txt");
        InputStream is=System.in;
        int c=is.read();
        while(((char) c)!='x'){
            fw.write(c);
            c=is.read();
        }
        fw.close();
        is.close();
    }
    public static void writefileString() throws Exception{
        FileWriter fw=new FileWriter("D:\\logFile.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String c=br.readLine();
        while(!c.equals("stop")){
            bw.write(c+"\r\n");
            c=br.readLine();
        }
        bw.close();
        fw.close();
        br.close();
    }
    public static void readfileChar() throws Exception{
        FileReader fw=new FileReader("D:\\logFile.txt");
        int c=fw.read();
        while(c!=-1){
            System.out.println((char)c);
            c=fw.read();
        }
        fw.close();
    }
    public static void readfileString() throws Exception{
        System.out.println("开始读");
        BufferedReader br=new BufferedReader(new FileReader("D:\\logFile.txt"));
        String c=br.readLine();
        while(c!=null){
            System.out.println(c);
            c=br.readLine();
        }
        br.close();
    }

    public static void main(String[] args) throws Exception{
        readfileString();
    }
}
