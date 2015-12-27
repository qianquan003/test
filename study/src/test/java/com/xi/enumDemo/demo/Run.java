package com.xi.enumDemo.demo;

/**
 * 
 * @author			JiDong
 * @create			November 23.2009
 *
 */
public class Run {
	
	public static void main(String [] args){
		ReceptionDesk receptionDesk =ReceptionDesk.getInstatnce();
		receptionDesk.createCard();
		
		Employee employee1 = new Employee();	
		employee1.setStrName(" A");		
		employee1.setCard(receptionDesk.getCard(CardType.OPENFLOOR));
		
		System.out.println(employee1.toString());
	}
}
