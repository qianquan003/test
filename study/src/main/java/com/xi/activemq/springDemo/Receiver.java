package com.xi.activemq.springDemo;

import java.util.Map;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import org.springframework.jms.core.JmsTemplate;

/**
 * <b>function:</b> Spring JMSTemplate ��Ϣ������
 * <p/>
 * �������web���̣���������Ҫ��jms��ʱ��ֻ����ע��jmsTemplate���ɡ�
 */
public class Receiver {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:applicationContext-*.xml");
        JmsTemplate jmsTemplate = (JmsTemplate) ctx.getBean("jmsTemplate");
        while (true) {
            Map<String, Object> map = (Map<String, Object>) jmsTemplate.receiveAndConvert();
            System.out.println("�յ���Ϣ��" + map.get("message"));
        }
    }
}