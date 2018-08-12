package model;

import model.interfaces.PlayingCard;

public abstract class PlayingCardImpl implements PlayingCard {

	private Suit suit;
	private Value value;

	public PlayingCardImpl(Suit suit, Value value) {

		this.suit = suit;
		this.value = value;
	}

	public Suit getSuit() {

		return suit;
	}

	public Value getValue() {

		return value;
	}

	// public String toString() {}

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

	public boolean equals(PlayingCardImpl card) {
		
		
		
		
	}

}
