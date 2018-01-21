package model;

import java.awt.Color;

import javax.swing.JButton;

public class MainController{

	private MainView mainView;
	private JButton[][] button; 

	public MainController(){
		createMap("map");
		mainView = new MainView();
		mainView.updateMap(button);
		mainView.getMap().revalidate();
		//mainView.repaint();
	}

	public MainView getMainView(){
		return mainView;
	}

	public void createMap(String areaName){
		button = new JButton[25][25];
		Color col = new Color(255,255,250);
		int x = 0;
		for(int i = 0; i<25; i++){
			for(int j=0; j<25; j++){
				x = (int)(Math.random()*5 + 1);
				switch (x) {
				case 1:  col = Color.WHITE;
				break;
				case 2:	col = Color.BLACK;
				break;
				case 3: col = Color.RED;
				break;
				case 4: col = Color.BLUE;
				break;
				case 5: col = Color.GREEN;
				break;
				}
				button[i][j] = new JButton("x " + i + " " + j);
				button[i][j].setBackground(col);
				System.out.println(x);
				button[i][j].setVisible(true);
				//System.out.println(button[i][j].getText());
			}

		}
	}

}