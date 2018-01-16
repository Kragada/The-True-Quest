package model;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Model {
	
	private MainController mainController;
	private MainView mainView;
	private Player player;
	
	public Model(){
		
		mainController = new MainController();
		player = new Player();
	}
	
	public MainController getMainController(){
		return mainController;
	}
	
	public MainView getView(){
		return mainView;
	}
	
	public Player getPlayer(){
		return player;
	}

}
