package com.xi.activemq;

import java.util.Date;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
/**
 * queue:��Ϣ������
 *
 * @author  �ĳ�
 * @version  [�汾��, Apr 27, 2013 5:28:49 PM ]
 * @see  [�����/����]
 * @since  [��Ʒ/ģ��汾]
 */
public class Consumer {
	public static void main(String[] args) {
		String user = ActiveMQConnection.DEFAULT_USER;
		String password = ActiveMQConnection.DEFAULT_PASSWORD;
		String url = ActiveMQConnection.DEFAULT_BROKER_URL;
		String subject = "TOOL.DEFAULT";
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory( user, password, url);
		Connection connection;
		try {
			connection = connectionFactory.createConnection();
			connection.start();
			final Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
			Destination destination = session.createQueue(subject);
			MessageConsumer message = session.createConsumer(destination);
			message.setMessageListener(new MessageListener() {
				public void onMessage(Message msg) {
					MapMessage message = (MapMessage) msg;
					try {
						System.out.println("���ն��յ���Ϣ��" +message.getString("seqnum")+":"+ new Date(message.getLong("data")));
						session.commit();
					} catch (JMSException e) {
						e.printStackTrace();
					}
				}
			});
			Thread.sleep(3000);
			session.close();
			connection.close();
		} catch (JMSException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
