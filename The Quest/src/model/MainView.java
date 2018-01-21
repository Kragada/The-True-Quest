package model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class MainView {
	
	private JFrame frame;
	private JPanel map, stats;
	
	public MainView(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setSize((int)width, (int)height);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout(FlowLayout.LEFT, 0,0));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		stats = new JPanel();
		stats.setPreferredSize(new Dimension((frame.getWidth()/4)-(int)(frame.getWidth()*0.01), frame.getHeight()));
		//stats.setBorder(BorderFactory.createLoweredBevelBorder());
		stats.setBackground(Color.BLACK);
		stats.setVisible(true);
		
		map = new JPanel();
		map.setPreferredSize(new Dimension((frame.getWidth()/4)*3, frame.getHeight()));
		//map.setBorder(BorderFactory.createLoweredBevelBorder());
		map.setVisible(true);
		map.setLayout(new GridLayout(25,25));
		
		frame.add(map);
		frame.add(stats);
		//frame.pack();
	}

	public void renderMap(){
		
	}
	
	public void updateMap(JButton[][] button){
		getMap().removeAll();
		for(int i = 0; i<25; i++){
			for(int j=0; j<25; j++){
				getMap().add(button[i][j]);
				//System.out.println(button[i][j].getText() + "Sista");
			}
		}
	}
	
	public JFrame getFrame(){
		return frame;
	}
	
	public JPanel getMap(){
		return map;
	}

}
