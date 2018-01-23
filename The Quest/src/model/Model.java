package model;

//import org.newdawn.slick.AppGameContainer;
//import org.newdawn.slick.SlickException;

public class Model {
	
	private MainController mainController;
	private MainView mainView;
	private Player player;
	
	public Model(){
		player = new Player();
		mainController = new MainController(player);
		
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
