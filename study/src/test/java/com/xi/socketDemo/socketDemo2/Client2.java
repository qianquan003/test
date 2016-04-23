package com.xi.socketDemo.socketDemo2;

import com.xi.model.Student;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by xisir on 2016/4/23.
 */
public class Client2 {
    public void connServer() {
        PrintWriter pw =null;
        BufferedReader br =null;
        String readLine=null;
        try {
            while(!"bye".equals(readLine)){
                Socket socket = new Socket("localhost", Server2.SERVER_PORT);
                //得到Socket的输入流封装成一个PrintWriter
                pw = new PrintWriter(socket.getOutputStream(), true);
                System.out.print("我client：");
                Scanner sc=new Scanner(System.in);
                String content = sc.nextLine();
                Server2.writefileString("client:",content);
                pw.println(content);
                //得到接收的这个Socket的输入流，并封装成一个BufferedReader()
                br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                readLine=br.readLine();
                System.out.println("server:" + readLine);
                pw.close();
                br.close();
                socket.close();
            }
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) {
        new Client2().connServer();
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        df.format(new Date());
//        System.out.println(df.format(new Date()));
    }
}
