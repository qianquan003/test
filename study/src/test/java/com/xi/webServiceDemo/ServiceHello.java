package com.xi.webServiceDemo;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class ServiceHello {

	/**
	 * ���ͻ��˵��õķ���
	 * 
	 * @param name
	 * @return
	 */
	public String getValue(String name) {
		return "my name is:" + name;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:9001/Service/ServiceHello",new ServiceHello());
		System.out.println("service success!");
	}

}
