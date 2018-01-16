package model;

public class Model {
	
	private MainController mainController;
	private Player player;
	
	public Model(){
		mainController = new MainController();
		player = new Player();
	}
	
	public MainController getMainController(){
		return mainController;
	}
	
	public Player getPlayer(){
		return player;
	}

}
