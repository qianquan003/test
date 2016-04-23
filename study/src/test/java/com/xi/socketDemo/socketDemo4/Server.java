package com.xi.socketDemo.socketDemo4;

import java.io.*;
import java.net.*;
 
public class Server {
 
    /**
     * @param args
     */
    static int index = 0;
    private static ServerSocket ss = null;
    private static Socket s = null;
 
    private static File f = null;
    private static RandomAccessFile fw = null;
 
    public static void main(String[] args) {
        Server sk = new Server();
        sk.initServer(8000);
    }
 
    /**
     * 初始化服务器端
     * 
     * @param port
     *            服务器端要使用的端口
     */
    public void initServer(int port) {
        try {
            ss = new ServerSocket(port);
            s = ss.accept();
            Thread t = new Thread(new HandleClient(s));
            t.start();
        } catch (IOException e) {
 
            e.printStackTrace();
        }
    }
 
    // 从SocketClient读取文件
 
    class HandleClient implements Runnable {
 
        Socket sock;
 
        HandleClient(Socket s) {
            sock = s;
        }
 
        public void run() {
            // TODO Auto-generated method stub
            byte[] b = new byte[1024];
 
            InputStream in=null;
            DataInputStream din = null;
             
            try {
                // 定义输入流，s.getInputStream();
 
                in = s.getInputStream();
                 din= new DataInputStream(new BufferedInputStream(in));
                // 创建要保存的文件
                f = new File("F:\\copy.jpg");
//                index++;
                fw = new RandomAccessFile(f, "rw");
 
                int num = din.read(b);
                while (num != -1) {
                    // 向文件中写入0~num个字节
                    fw.write(b, 0, num);
                    // 跳过num个字节再次写入文件
                    fw.skipBytes(num);
                    // 读取num个字节
                    num = din.read(b);
                }
                // 关闭输入，输出流
                din.close();
                fw.close();
                System.out.println("receive file successfully");
            } catch (IOException e) {
 
                e.printStackTrace();
            } 
        }
    }
 
}