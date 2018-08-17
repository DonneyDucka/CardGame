package model;

import model.interfaces.Player;
import view.GameEngineCallbackImpl;

public class SimplePlayer implements Player {

	private String name;
	private String id;
	private int initialPoints;
	private int bet;
	
	public SimplePlayer(String name, String id, int initial) {
		
		this.name = name;
		this.id = id;
		this.initialPoints = initial;
		
	}
	
	
	public String getPlayerName() {	
	
		return name;	
		
	}
	
	public void setPlayerName(String playerName) {	
	name = playerName;
	}
	
	public int getPoints() {
		
		
		return initialPoints;
	}
	
	public void setPoints(int points) {
		
		initialPoints = points;
	}
	
	public String getPlayerId() {
		
		return id;
		
	}

	public boolean placeBet(int bet) {
		
		this.bet = bet;
		
		if (bet >= 0 && bet <= initialPoints) {
		return true;	
		} else return false;
		
		
	}
	
	public int getBet() {
		
		return bet;
		
	}
    
	public void resetBet() {
		
		bet = 0;		
	}

	public int getResult() {
		
		return GameEngineCallbackImpl.
	}
	
	public void setResult(int result) {
		
	}
	
	public String toString() {
		
		String details = 
				"Player Id : " + getPlayerId() +
				"  Player Name : "+ getPlayerName() + 
				"  Player's Points : " + getPoints();
		return details;
		
	}
		

	
	

}

