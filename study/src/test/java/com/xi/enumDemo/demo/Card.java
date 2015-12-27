package com.xi.enumDemo.demo;

/**
 * The card class.
 * @author			JiDong
 * @create			November 23.2009
 *
 */
public class Card {
	
	 private CardType type;
	 private String cardId;
	 
	public Card(String type){
		this.type = CardType.valueOf(type);
	}
	
	public Card(CardType type) {
		this.type = type;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public CardType getType() {
		return type;
	}

	public void setType(CardType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardId == null) ? 0 : cardId.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (cardId == null) {
			if (other.cardId != null)
				return false;
		} else if (!cardId.equals(other.cardId))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		 return new StringBuilder().append("type").append(type)
		 			.append("cardId").append(cardId)
		 			.toString();
	}
	
	
	
}
