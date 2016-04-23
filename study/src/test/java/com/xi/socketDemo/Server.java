package com.xi.socketDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 用JAVA SOCKET编程，客户端随意输入个字符串，服务器端接受该字符串并把该字符串长度返回给客户端
 * Created by xisir on 2016/4/23.
 */
public class Server {
    public static final int SERVER_PORT = 8888;

    public void server() {
        try {
            ServerSocket ss = new ServerSocket(SERVER_PORT);
            Socket socket = ss.accept();
            //得到接收的这个Socket的输入流，并封装成一个BufferedReader()
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String readLine=br.readLine();
            System.out.println("read from client:" +readLine);
            //将从客户端接收到的数据在发送回客户端
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            int strSize =  readLine.length();
            pw.println(strSize);
            //关闭相应的资源
            br.close();
            pw.close();
//            InputStream is = socket.getInputStream();
//            OutputStream os = socket.getOutputStream();
//            byte[] buffer = new byte[100];
//            int length = is.read(buffer);
//            String content = new String(buffer, 0, length);
//            System.out.println("read from client:" + content);
//            int strLength = content.length();
//            String str = String.valueOf(strLength);
//            os.write(str.getBytes());
//            is.close();
//            os.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Server().server();
    }
}
