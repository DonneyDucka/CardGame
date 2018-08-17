package model;

import model.interfaces.PlayingCard;

public class PlayingCardImpl implements PlayingCard {

	private Suit suit;
	private Value value;


	public PlayingCardImpl(Suit s, Value v) {
		this.suit = s;
		this.value = v;
	}
	
    @Override
	public Suit getSuit() {

		return suit;
	}

    @Override
	public Value getValue() {

		return value;
	}

	@Override
	public String toString() {
		
		String details = "Suit : " + getSuit() + "  Value : " + getValue(); 
		return details;
		
	}

	@Override
	public int getScore() {

		int score = 0;
		switch (getValue()) {

		case ACE:
			score += 1;
			break;
		case TWO:
			score += 2;
			break;
		case THREE:
			score += 3;
			break;
		case FOUR:
			score += 4;
			break;
		case FIVE:
			score += 5;
			break;
		case SIX:
			score += 6;
			break;
		case SEVEN:
			score += 7;
			break;
		case EIGHT:
			score += 8;
			break;
		case NINE:
			score += 9;
			break;
		case TEN:
		case JACK:
		case QUEEN:			
		case KING:
			score += 10;
			break;
		}

		return score;
	}

	@Override
	public boolean equals(PlayingCard card) {
		
		if (card instanceof PlayingCard == false)
			return false;
		
		PlayingCardImpl other = (PlayingCardImpl) card;
		
		if (suit != other.getSuit() || value != other.getValue())
			return false;
		return true;
	}

	//@Override
	/*public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}*/


	

}
