package com.xi.socketDemo;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by xisir on 2016/4/23.
 */
public class Client {
    public void connServer() {
        try {
            Socket socket = new Socket("localhost", Server.SERVER_PORT);
            //得到Socket的输入流封装成一个PrintWriter
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            String content = "client";
            pw.println(content);
            //得到接收的这个Socket的输入流，并封装成一个BufferedReader()
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("string's  length:" + br.readLine());
//            InputStream is = socket.getInputStream();
//            OutputStream os = socket.getOutputStream();
//            String content = "This comes from client";
//            os.write(content.getBytes());
//            byte[] b = new byte[100];
//            int length = is.read(b);
//            String str = new String(b, 0, length);
//            System.out.println("string's  length:" + str);
//            is.close();
//            os.close();
            pw.close();
            br.close();
            socket.close();
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) {
        new Client().connServer();
    }
}
