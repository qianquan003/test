package com.xi.activemq.springDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jms.JMSException;

import javax.jms.MapMessage;

import javax.jms.Message;

import javax.jms.Session;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import org.springframework.jms.core.JmsTemplate;

import org.springframework.jms.core.MessageCreator;

/**
 * <b>function:</b> Spring JMSTemplate 消息发送者
 */
public class Sender {
    public static void main(String[] args) {
        ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext-*.xml");
//        new FileSystemXmlApplicationContext("classpath:applicationContext-*.xml");
        JmsTemplate jmsTemplate = (JmsTemplate) ctx.getBean("jmsTemplate");
        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                MapMessage message = session.createMapMessage();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String date = sdf.format(new Date().getTime());
                message.setString("message", "current system time: " + date);
                return message;
            }
        });
    }
}