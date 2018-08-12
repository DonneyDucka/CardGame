package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

import model.interfaces.GameEngine;
import model.interfaces.Player;
import model.interfaces.PlayingCard;
import view.GameEngineCallbackImpl;
import view.interfaces.GameEngineCallback;

public abstract class GameEngineImpl implements GameEngine {

	private ArrayList<Player> players;
	private ArrayList<GameEngineCallback> callbacks;
	private Deque<PlayingCard> pc = new LinkedList<PlayingCard>();

	public GameEngineImpl() {

	}	

	public static final int BUST_LEVEL = 21;

	public void dealPlayer(Player player, int delay) {
	}

	public void dealHouse(int delay) {
	}

	public void addPlayer(Player player) {

		players.add(player);

	}

	public Player getPlayer(String id) {

		Player a = null;

		for (int i = 0; i < players.size(); i++) {

			if (players.get(i).getPlayerId().equalsIgnoreCase(id)) {

				a = players.get(i);
			}

		}
		return a;

	}

	public boolean removePlayer(Player player) {

		boolean a = false;

		if (players.contains(player)) {
			players.remove(player);
			a = true;

		}

		return a;

	}

	public Collection<Player> getAllPlayers() {

		return players;
	}

	public boolean placeBet(Player player, int bet) {

		boolean check = false;

		if (players.contains(player)) {
			player.placeBet(bet);
			check = true;
		} else
			check = false;

		return check;
	}

	public void addGameEngineCallback(GameEngineCallback gameEngineCallback) {

		if (callbacks.contains(gameEngineCallback) == false) {
			callbacks.add(gameEngineCallback);
		}

	}

	public boolean removeGameEngineCallback(GameEngineCallback gameEngineCallback) {

		if (callbacks.contains(gameEngineCallback)) {
			callbacks.remove(gameEngineCallback);
			return true;
		} else
			return false;

	}

	public Deque<PlayingCard> getShuffledDeck() {
		    
		  for (Integer number : pc) {
		     System.out.println("Number = " + number);
		  }

		  Collections.shuffle(list);
		  Deque<Integer> deque = new ArrayDeque<Integer>(list);
		 
		  int retval = deque.getFirst();
		  System.out.println("Retrieved Element is = " + retval);
	}
}
