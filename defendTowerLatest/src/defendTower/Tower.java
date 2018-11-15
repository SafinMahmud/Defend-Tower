package defendTower;

import java.awt.Graphics;

import javax.swing.*;

public class Tower {
	
	private int x,y;
	private String imagePath;
	private boolean isAlive;
	
	
	public Tower() {
		
		
	}
	public Tower(int x, int y, String imagePath,boolean isAlive) {
		
		this.x = x;
		this.y = y;
		this.imagePath = imagePath;
		this.isAlive = isAlive;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public boolean isAlive() {
		return isAlive;
	}
    public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
    public void draw(Graphics g){
		ImageIcon Tower = new ImageIcon(imagePath);
		g.drawImage(Tower.getImage(), x, y, null);
		
	}

}
