package com.xi.nioDemo.ReactorDemo;

import java.io.IOException;
import java.nio.channels.SocketChannel;

/**
 * Created by Administrator on 2016/3/10.
 */
public class Acceptor implements Runnable {
    private Reactor reactor;
    public Acceptor(Reactor reactor) {
        this.reactor = reactor;
    }
    public void run() {
        try {
            SocketChannel socketChannel = reactor.serverSocketChannel.accept();
            if (socketChannel != null)// 调用Handler来处理channel
                new SocketReadHandler(reactor.selector, socketChannel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
