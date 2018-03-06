package model;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;

public class MainController implements KeyListener{

	private MainView mainView;
	private JButton[][] button;
	private Player player;
	private String stats;

	public MainController(Player player1){
		player = player1;
		createMap("map");
		mainView = new MainView();
		mainView.getFrame().addKeyListener(this);
		mainView.updateMap(button);
		mainView.getMap().revalidate();
		
		player.setName("Bobby the Unwilling");
		player.setCurrentHealth(10);
		player.setMaxHealth(10);
		player.setCurrentMana(5);
		player.setMaxMana(5);
		
		stats = "Name: " + player.getName() + "\n" + "Health: " + player.getCurrentHealth()
		+ "/" + player.getMaxHealth() + "\n" + "Mana: " + player.getCurrentMana() + "/" + player.getMaxMana();
		
		mainView.getStatsArea().setText(stats);
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
				case 2:	col = Color.YELLOW;
				break;
				case 3: col = Color.RED;
				break;
				case 4: col = Color.BLUE;
				break;
				case 5: col = Color.GREEN;
				break;
				}
				if(i == player.getPosition().getX() && j  == player.getPosition().getY()){
					button[i][j] = new JButton("x " + i + " " + j);
					button[i][j].setBackground(Color.BLACK);
					System.out.println(x);
					button[i][j].setVisible(true);
				}else{
					button[i][j] = new JButton("x " + i + " " + j);
					button[i][j].setBackground(col);
					System.out.println(x);
					button[i][j].setVisible(true);
					//System.out.println(button[i][j].getText());
				}
			}

		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("HELLO!");
		int i = e.getKeyCode();
		System.out.println(i);
		if(i == 10){
			if(mainView.getFrame().isVisible()){
				mainView.getFrame().setVisible(false);
			}else if(!mainView.getFrame().isVisible()){
				mainView.getFrame().setVisible(true);
			} //up = 38, vänster = 37, ner = 40 och höger = 39
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}