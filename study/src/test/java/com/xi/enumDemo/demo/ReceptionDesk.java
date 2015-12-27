package com.xi.enumDemo.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * The 
 * @author 			JiDong
 * @create			November 23.2009
 * 
 */
public class ReceptionDesk {
	
	private Map<CardType, Card> cardMap = new HashMap<CardType, Card>();
	private static ReceptionDesk me;
	
	private ReceptionDesk(){}
	
	public static ReceptionDesk getInstatnce(){
		if (me == null) {
			me = new ReceptionDesk();
		}
		
		return me;
	}
	
	public void createCard(){
		Card card1 = new Card(CardType.OPENFLOOR);
		cardMap.put(CardType.OPENFLOOR,card1);
		
		Card card2= new Card(CardType.BACKFLOOR); 
		cardMap.put(CardType.BACKFLOOR,card2);
	}
	
	public Card getCard(CardType key){
		if (cardMap.containsKey(key)) {
			return (Card)cardMap.get(key);
		}else{
			cardMap.put(key,new Card(key));
		}
		return (Card)cardMap.get(key);
	}
	
	public Card getCard(String type) {
		return getCard(CardType.valueOf(type));
	}

	public Map<CardType, Card> getCardMap() {
		return cardMap;
	}

	public void setCardMap(Map<CardType, Card> cardMap) {
		this.cardMap = cardMap;
	}
	
}
