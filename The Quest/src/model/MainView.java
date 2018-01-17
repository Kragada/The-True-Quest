package model;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainView {
	
	private JFrame frame;
	private JPanel map;
	
	public MainView(){
		frame = new JFrame();
		frame.setSize(800, 600);
		frame.setVisible(true);
	}

	public void renderMap(){
		
	}
	
	public void updateMap(){
		
	}
	
	public JFrame getFrame(){
		return frame;
	}
	
	public JPanel getMap(){
		return map;
	}

}
