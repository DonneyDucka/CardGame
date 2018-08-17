package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

import model.interfaces.GameEngine;
import model.interfaces.Player;
import model.interfaces.PlayingCard;
import model.interfaces.PlayingCard.Suit;
import model.interfaces.PlayingCard.Value;
import view.GameEngineCallbackImpl;
import model.PlayingCardImpl;
import view.interfaces.GameEngineCallback;

public class GameEngineImpl implements GameEngine {

	private ArrayList<Player> players = new ArrayList<Player>();
	private ArrayList<GameEngineCallback> callbacks = new ArrayList<GameEngineCallback>();
	private ArrayList<PlayingCard> pc = new ArrayList<PlayingCard>();



	
	public GameEngineImpl() {

	}	
	@Override
	public void dealPlayer(Player player, int delay) {
		
		int total = 0;
		
		getShuffledDeck();
		
		ArrayList<PlayingCard> playersHand = new ArrayList<PlayingCard>();
		
		for(int i = 0; total < BUST_LEVEL ; i++) {
			
			playersHand.add(pc.get(i));
			
			total += pc.get(i).getScore();		
		} 
		
		
		
	}
	@Override
	public void dealHouse(int delay) {


	}
	@Override
	public void addPlayer(Player player) {

		if (player == null ) {
			players.add(player);
		}	
	}
	@Override
	public Player getPlayer(String id) {

		Player a = null;

		for (int i = 0; i < players.size(); i++) {

			if (players.get(i).getPlayerId().equalsIgnoreCase(id)) {

				a = players.get(i);
				break;
			}

		}
		return a;

	}
	@Override
	public boolean removePlayer(Player player) {

		boolean a = false;

		if (players.contains(player)) {
			players.remove(player);
			a = true;

		}

		return a;

	}
	@Override
	public Collection<Player> getAllPlayers() {

		return Collections.unmodifiableCollection(players);
	}
	@Override
	public boolean placeBet(Player player, int bet) {
		
		if (players.contains(player)) {
			player.placeBet(bet);
			return true;
		} else
			return false;

	}
	@Override
	public void addGameEngineCallback(GameEngineCallback gameEngineCallback) {

		if (gameEngineCallback == null && callbacks.contains(gameEngineCallback) == false) {
			callbacks.add(gameEngineCallback);
		}

	}
	@Override
	public boolean removeGameEngineCallback(GameEngineCallback gameEngineCallback) {

		if (callbacks.contains(gameEngineCallback)) {
			callbacks.remove(gameEngineCallback);
			return true;
		} else
			return false;

	}
	@Override
	public Deque<PlayingCard> getShuffledDeck() {
		
		for (Suit s : Suit.values()) {
			for (Value v : Value.values()) {
				PlayingCardImpl c = new PlayingCardImpl(s,v);
				pc.add(c);
			}  
		}	

		Collections.shuffle(pc);

		Deque<PlayingCard> shuffledDeck = new LinkedList<PlayingCard>(pc);

		return shuffledDeck; }		

}
