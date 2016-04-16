package com.xi.minaDemo;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

/**
 * Created by Administrator on 2016/3/10.
 */
public class TimeClientHandler extends IoHandlerAdapter {
    public void messageReceived(IoSession session, Object message) throws Exception {
        String content = message.toString();
        System.out.println("client receive a message is : " + content);
    }

    public void messageSent(IoSession session, Object message) throws Exception {
        System.out.println("messageSent -> ：" + message);
    }
}
