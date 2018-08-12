package model;

import model.interfaces.Player;
import view.GameEngineCallbackImpl;

public abstract class SimplePlayer implements Player {

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

	//public int getResult() {}
	
	//public void setResult(int result) {}
	
	public String toString() {
		
		String details = 
				String.format("%/5s %/n", "Player Id : ", getPlayerId()) +
				String.format("%/5s %/n", "Player Name : ", getPlayerName()) + 
				String.format("%/5s %/n", "Player's Points : ", getPoints()) + 
				String.format("%/5s %/n", "Player's bet : ", getBet());
		return details;
		
	}
		

	
	

}

