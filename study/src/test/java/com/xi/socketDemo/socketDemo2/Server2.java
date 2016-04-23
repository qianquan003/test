package com.xi.socketDemo.socketDemo2;

import com.xi.model.Student;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 用socket实现简单的聊天，客户端发送消息，服务端接收消息并回复消息发送给客户端，发送bye聊天结束并将聊天记录保存到本地
 * Created by xisir on 2016/4/23.
 */
public class Server2 {
    public static final int SERVER_PORT = 8888;

    public void server() {
        Student student=new Student();
        BufferedReader br =null;
        PrintWriter pw =null;
        String readLine=null;
        FileWriter fw= null;
        try {
            ServerSocket ss = new ServerSocket(SERVER_PORT);
            while(!"bye".equals(readLine)){
                Socket socket = ss.accept();
                fw = new FileWriter("D:\\socket.txt");
                BufferedWriter bw=new BufferedWriter(fw);
                //得到接收的这个Socket的输入流，并封装成一个BufferedReader()
                br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                readLine=br.readLine();
                System.out.println("client:" + readLine);
                //将从客户端接收到的数据在发送回客户端
                pw = new PrintWriter(socket.getOutputStream(), true);
                System.out.print("我server：");
                Scanner sc = new Scanner(System.in);
//                String str=sc.nextLine();
                student.setName(sc.nextLine());
                if(student.getName()!=null){
                    bw.write("client:" +student.getName()+"\r\n");
                }
                pw.println(sc.nextLine());

                //关闭相应的资源
                bw.close();
                fw.close();
                br.close();
                pw.close();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writefileString() {
        FileWriter fw= null;
        try {
            fw = new FileWriter("D:\\logFile.txt");
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Server2().server();
    }
}
