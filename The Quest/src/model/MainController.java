package model;


public class MainController{
	
	private MainView mainView;
	
	public MainController(){
		mainView = new MainView();
	}
	
	public MainView getMainView(){
		return mainView;
	}

}