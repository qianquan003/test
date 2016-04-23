package com.xi.socketDemo.socketDemo1;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by xisir on 2016/4/23.
 */
public class Client1 {
    public void connServer() {
        PrintWriter pw =null;
        BufferedReader br =null;
        String readLine=null;
        try {
            do{
                Socket socket = new Socket("localhost", Server1.SERVER_PORT);
                //得到Socket的输入流封装成一个PrintWriter
                pw = new PrintWriter(socket.getOutputStream(), true);
                System.out.print("我client：");
                Scanner sc=new Scanner(System.in);
                String content = sc.nextLine();
                pw.println(content);
                //得到接收的这个Socket的输入流，并封装成一个BufferedReader()
                br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                readLine=br.readLine();
                System.out.println("server:" +readLine );
                pw.close();
                br.close();
                socket.close();
            }while(!"bye".equals(readLine));
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) {
        new Client1().connServer();
    }
}
