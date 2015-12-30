package com.xi.webServiceDemo;


import com.xi.axis2.*;

public class ServiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		com.xi.axis2.ServiceHello hello=new ServiceHelloService().getServiceHelloPort();
		String name=hello.getValue("Hyan");
		System.out.println(name);
	}

}
