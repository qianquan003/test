package com.xi.activemq.springDemo;

import java.util.Map;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import org.springframework.jms.core.JmsTemplate;

/**
 * <b>function:</b> Spring JMSTemplate 消息接收者
 * <p/>
 * 如果你是web工程，那你在需要用jms的时候，只需用注入jmsTemplate即可。
 */
public class Receiver {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:applicationContext-*.xml");
        JmsTemplate jmsTemplate = (JmsTemplate) ctx.getBean("jmsTemplate");
        while (true) {
            Map<String, Object> map = (Map<String, Object>) jmsTemplate.receiveAndConvert();
            System.out.println("收到消息：" + map.get("message"));
        }
    }
}