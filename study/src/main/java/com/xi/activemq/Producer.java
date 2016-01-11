package com.xi.activemq;

import java.util.Date;
import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.MessageProducer;
import javax.jms.Session;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;


/**
 * ��Ϣ�ķ�����
 */
public class Producer {
	public static void main(String[] args) {
		String user = ActiveMQConnection.DEFAULT_USER;
		String password = ActiveMQConnection.DEFAULT_PASSWORD;
		String url = ActiveMQConnection.DEFAULT_BROKER_URL;
		String subject = "TOOL.DEFAULT";
		/**�������ӹ���*/
		ActiveMQConnectionFactory contectionFactory = new ActiveMQConnectionFactory( user, password, url);

		try {
			/**��������*/
			Connection connection = contectionFactory.createConnection();
			connection.start();//��������
			/**����session*/
			Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
			/**ָ����Ϣ��Ŀ�ĵ�*/
			Destination destination = session.createQueue(subject);
			/**����������Ϣ����*/
			MessageProducer producer = session.createProducer(destination);

			for (int i = 0; i <= 2; i++) {
				MapMessage message = session.createMapMessage();
				Date date = new Date();
				message.setLong("date", date.getTime());
				message.setString("seqnum", String.valueOf(i));
				Thread.sleep(1000);
				producer.send(message);
				System.out.println("���Ͷ˷�����Ϣ��" + date);
			}
			session.commit();
			session.close();
			connection.close();
		} catch (JMSException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
