package model;

import java.awt.Point;

public class Player {
	
	private Point position;
	private int currentHealth, maxHealth, currentMana, maxMana;
	private String name;
	
	public Player(){
		position = new Point(12, 12);
	}
	
	public Point getPosition(){
		return position;
	}
	
	public int getCurrentHealth(){
		return currentHealth;
	}
	
	public void setCurrentHealth(int i){
		currentHealth = i;
	}
	
	public int getMaxHealth(){
		return maxHealth;
	}
	
	public void setMaxHealth(int i){
		maxHealth = i;
	}
	
	public int getCurrentMana(){
		return currentMana;
	}
	
	public void setCurrentMana(int i){
		currentMana = i;
	}
	
	public int getMaxMana(){
		return maxMana;
	}
	
	public void setMaxMana(int i){
		maxMana = i;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String s){
		name = s;
	}

}
