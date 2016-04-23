package com.xi.socketDemo.socketDemo1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 用socket实现简单的聊天，客户端发送消息，服务端接收消息并回复消息发送给客户端，发送bye聊天结束
 * Created by xisir on 2016/4/23.
 */
public class Server1 {
    public static final int SERVER_PORT = 8888;

    public void server() {
        BufferedReader br =null;
        PrintWriter pw =null;
        String readLine=null;
        try {
            ServerSocket ss = new ServerSocket(SERVER_PORT);
            while(!"bye".equals(readLine)){
                Socket socket = ss.accept();
                //得到接收的这个Socket的输入流，并封装成一个BufferedReader()
                br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                readLine=br.readLine();
                System.out.println("client:" +readLine);
                //将从客户端接收到的数据在发送回客户端
                pw = new PrintWriter(socket.getOutputStream(), true);
                System.out.print("我server：");
                Scanner sc=new Scanner(System.in);
                pw.println(sc.nextLine());
                //关闭相应的资源
                br.close();
                pw.close();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Server1().server();
    }
}
