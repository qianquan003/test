package com.xi.nioDemo.ReactorDemo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2016/3/10.
 */
public class Reactor implements Runnable {
    //NIO 有一个主要的类Selector，这个类似一个观察者，
    // 只要我们把需要探知的SocketChannel告诉Selector，我们接着做别的事情，
    // 当有事件发生时，他会通知我们，传回一组SelectionKey，我们读取这些Key，
    // 就会获得我们刚刚注册过的SocketChannel，然后，我们从这个Channel中读取数据，
    // 接着我们可以处理这些数据。
    public final Selector selector;
    public final ServerSocketChannel serverSocketChannel;
    public Reactor(int port) throws IOException {
        selector=Selector.open();
        serverSocketChannel=ServerSocketChannel.open();
        InetSocketAddress inetSocketAddress=new InetSocketAddress(InetAddress.getLocalHost(),port);
        serverSocketChannel.socket().bind(inetSocketAddress);
        serverSocketChannel.configureBlocking(false);
        // 向selector注册该channel
        SelectionKey selectionKey=serverSocketChannel.register(selector,SelectionKey.OP_ACCEPT);
        // 利用selectionKey的attache功能绑定Acceptor 如果有事情，触发Acceptor
        selectionKey.attach(new Acceptor(this));
    }
    public void run() {
        try{
            while(!Thread.interrupted()){
                selector.select();
                Set<SelectionKey> selectionKeySets=selector.selectedKeys();
                Iterator<SelectionKey> it=selectionKeySets.iterator();
                // Selector如果发现channel有OP_ACCEPT或READ事件发生，下列遍历就会进行
                while(it.hasNext()){
                    // 来一个事件 第一次触发一个accepter线程
                    // 以后触发SocketReadHandler
                    SelectionKey selectionKey=it.next();
                    dispatch(selectionKey);
                    selectionKeySets.clear();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 运行Acceptor或SocketReadHandler
     *
     * @param key
     */
    void dispatch(SelectionKey key) {
        Runnable r=(Runnable)(key.attachment());
        if(r!=null){
            r.run();
        }
    }
}
