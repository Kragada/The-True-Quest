package model;

import javax.swing.JFrame;


public class MainView {
	
	private JFrame frame;
	
	public MainView(){
		frame = new JFrame();
		frame.setSize(800, 600);
		frame.setVisible(true);
	}

	public JFrame getFrame(){
		return frame;
	}
}
