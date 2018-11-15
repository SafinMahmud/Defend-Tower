package defendTower;


import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class GameBoard extends JPanel implements MouseListener,MouseMotionListener{
		
 		Cannon cannon;
		Missile[]  missile = new Missile[14];
		EnemyPlane enemy ;
		int missileCount = 0;
		Tower tower ;
		Tower tower2;
		Tower boom;
		Gameover gameover;
	public GameBoard(){
		
		cannon = new Cannon(450,480,"Image//cannon.png");
		
		for(int i = 0;i < missile.length;i++){
				missile[i] = new Missile(450,600,"Image//missile.png");
		}
		
		enemy = new EnemyPlane(1000,100,"Image//enemy.png", true);	
        tower = new Tower(10,50,"Image//tower.png",true);
		tower2 = new Tower(10,235,"Image//tower2.png",true);
		boom = new Tower(10,50,"Image//boom.png",true);
        gameover = new Gameover(50,50,"Image//gameover.png");
		
		
		super.addMouseListener(this);
		super.addMouseMotionListener(this);
		super.setFocusable(true);
	}
	
	public void paint(Graphics g){
		
		ImageIcon background = new ImageIcon("Image//gameBackground.png");
		g.drawImage(background.getImage(),0,0,null);
		
		cannon.draw(g);
		for(int i=0;i<missile.length;i++){
			if(enemy.isAlive() == true){
		           enemy.draw(g);
			}
		     missile[i].draw(g);
		}
		   
		         tower.draw(g);
		         int c = MissileFiring.MissileCount();
		         String s = Integer.toString(c);
		    g.drawString(s,900, 30);
		     int c2=PlaneMoving.count();
			if(c2 == 1){
		    	//System.out.println("qw");
				boom.draw(g);
				
				
				g.drawString(s,300, 300);
				
		     }
			if(c2 == 2){
				tower2.draw(g);
				gameover.draw(g);
			}
			
			//System.exit(1);
			
		
	}
	
    public void startGame(){
		
	PlaneMoving p = new PlaneMoving(this,enemy,missile,tower);
	
	p.start();
		
	
			
		
		
	}

	

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
		
		
				
		
			missile[missileCount].setX(cannon.getX()+25);
			missile[missileCount].setY(cannon.getY());
			
			MissileFiring firing = new MissileFiring(this,enemy,missile[missileCount]);
			firing.start();
			missileCount++;
			if(missileCount == 13)
				missileCount = 0;
		  
	}
	

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX()>225){
			
			cannon.setX(e.getX());
			repaint();
			}
	}
	
		
	}



