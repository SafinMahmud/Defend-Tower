package defendTower;

import java.awt.Rectangle;

import javax.swing.JOptionPane;

public class PlaneMoving extends Thread{
	private GameBoard background;
	private EnemyPlane enemy ;
	private Missile[] missile;
	private Tower tower;
	public static int c1=0;
	
	public PlaneMoving(GameBoard background, EnemyPlane enemy, Missile[] missile, Tower tower) {
		
		this.background = background;
		this.enemy = enemy;
		this.missile = missile;
		this.tower = tower;
	}
	

	

	public void run(){
		
	for(int i = 0;i < 3 ; i++){	
		
		while(enemy.getX() > 0){
			
			enemy.setX(enemy.getX() - 1);
			checkCollision();
			try {
				Thread.sleep(5);
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
			
			}
			
			
			background.repaint();
		    }
		
			
			
		   
			//enemy.setX(-50);
		}
	
		
	}




	public void checkCollision() {
		
		

		
		for(int i = 0;i < 14;i++){
			
			Rectangle enemyRect = new Rectangle(enemy.getX(),enemy.getY(),200,100);
			Rectangle  towerRect= new Rectangle(tower.getX(),tower.getY(),170,512);
						
			if(enemyRect.intersects(towerRect)==true){
			  enemy.setX(1000);
			  tower.setX(-500);
			   c1++;
			   GameSound.planeHit();
			try{			
			  	Thread.sleep(5); 	
			}
			catch(Exception e){}
			 if(c1<2)
			tower.setX(10);
			 GameSound.planeHit();
			}
			
			
		}
		
		
		
	}
	
	public static int count(){
		
		return c1;
		
	}
	
}

