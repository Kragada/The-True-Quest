package model;

public class MainController {
	
	private MainView mainView;
	
	public MainController(){
		mainView = new MainView("Unwritten tale");
	}
	
	public MainView getMainView(){
		return mainView;
	}
	
}
