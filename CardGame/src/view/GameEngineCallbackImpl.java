package view;

import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;

import model.GameEngineImpl;
import model.PlayingCardImpl;
import model.interfaces.GameEngine;
import model.interfaces.Player;
import model.interfaces.PlayingCard;
import view.interfaces.GameEngineCallback;

public class GameEngineCallbackImpl implements GameEngineCallback{
	
	private final Logger logger = Logger.getLogger(this.getClass().getName());
		
	public GameEngineCallbackImpl() {
		
	}
	
	@Override
	public void result(Player player, int result, GameEngine engine){
		
		
		
		
	}



	@Override
	public void nextCard(Player player, PlayingCard card, GameEngine engine) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void bustCard(Player player, PlayingCard card, GameEngine engine) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void nextHouseCard(PlayingCard card, GameEngine engine) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void houseBustCard(PlayingCard card, GameEngine engine) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void houseResult(int result, GameEngine engine) {
		// TODO Auto-generated method stub
		
	}
	
	
}
