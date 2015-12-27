package com.xi.enumDemo.demo;
/**
 * The Employee class.
 * @author			JiDong
 * @create			November 23.2009
 *
 */
public class Employee {
	
	private String strName;
	
	public Card card;
	
	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}
	
	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		EnsureSafety en = new EnsureSafety();
		en.checkCard(card);
		this.card = card;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((card == null) ? 0 : card.hashCode());
		result = prime * result + ((strName == null) ? 0 : strName.hashCode());
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
		Employee other = (Employee) obj;
		if (card == null) {
			if (other.card != null)
				return false;
		} else if (!card.equals(other.card))
			return false;
		if (strName == null) {
			if (other.strName != null)
				return false;
		} else if (!strName.equals(other.strName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return new StringBuilder().append(" strName ").append(strName)
								  .append("card ").append(card.getType())								 
								  .toString();
	}

	
}
