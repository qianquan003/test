package com.xi.socketDemo.socketDemo4;

import java.io.*;
import java.net.*;
 
public class Client {
 
    /**
     * @param args
     */
    private static File f = null;
    static FileInputStream fr = null;
    static DataOutputStream dout = null;
    private static Socket s = null; 
 
    public static void main(String[] args) throws IOException {
        Client sc = new Client();
        sc.connectSocketServer(8000); 
//        sc.sendFile("0", "jpg");
        sc.sendFile("1", "jpg");
//        sc.sendFile("2", "jpg");
        fr.close();
        dout.close();     
    }  
 
    /** 
     * 连接服务器端 
     * 
     * @param port
     *            要连接的服务器SocketServer端口
     */
    public void connectSocketServer(int port) {
        try {
            s = new Socket(InetAddress.getLocalHost(), port);
        } catch (UnknownHostException e) {
 
            e.printStackTrace();
        } catch (IOException e) {
 
            e.printStackTrace();
        }
    }
 
    // 发送文件
    public void sendFile(String name,String type) {
 
           
        byte[] b = new byte[1024];
 
        f = new File("F:\\enjoy\\img\\"+name+"."+type);
        try {
            // 数据输出流
            dout = new DataOutputStream(new BufferedOutputStream(s.getOutputStream()));
 
            // 文件读入流
            fr = new FileInputStream(f);
            int n = fr.read(b);
            while (n != -1) {
                // 向网络中写入数据
                dout.write(b, 0, n);
                dout.flush();
                // 再次读取n字节
                n = fr.read(b);
            }
 
            // 关闭流
             
            System.out.println("send file successfully");
        } catch (FileNotFoundException e) {
 
            e.printStackTrace();
        } catch (IOException e) {
 
            e.printStackTrace();
        }
    }
 
}