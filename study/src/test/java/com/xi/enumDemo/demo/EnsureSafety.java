package com.xi.enumDemo.demo;

/**
 * The ensure safety class.
 * @author 			JiDong
 * @create			November 23.2009
 * 
 */
public class EnsureSafety {

	public void checkCard(Card card){
		if (card != null) {
			detect();
		}
	}
	
	public void detect(){
		System.out.println(" open the floor ! ");
	}
	
}
