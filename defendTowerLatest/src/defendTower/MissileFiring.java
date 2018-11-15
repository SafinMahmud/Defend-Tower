package defendTower;


import java.awt.Rectangle;

public class MissileFiring extends Thread{
	
		private GameBoard background;
		private EnemyPlane enemy ;
		private Missile missile;
		public static int count = 0;
		
		
		public MissileFiring(GameBoard background, EnemyPlane enemy,
				Missile missile) {
			super();
			this.background = background;
			this.enemy = enemy;
			this.missile = missile;
		}

		public void run(){
			
			while(missile.getY() > 0){
				
				missile.setY(missile.getY() - 1);
				checkCollision1();
				try {
					Thread.sleep(7);
				} 
				catch (Exception e) {
					// TODO Auto-generated catch block
				
				}
				
			
				background.repaint();
				
		
			}
			
			missile.setY(-50);
		
		}

		
		
		

		public void checkCollision1() {
			
			Rectangle missileRect = new Rectangle(missile.getX(),missile.getY(),8,8);
			
			//for(int i = 0;i < 15;i++){
				
				Rectangle enemyRect = new Rectangle(enemy.getX(),enemy.getY(),190,100);
				
				if(missileRect.intersects(enemyRect)==true){
					
				 enemy.setX(1010);
				 missile.setX(-50);
				 count++;
				 GameSound.missileHit();
					
				//}
			}
		}
		
		public static int MissileCount(){
			return count;
		}
		
			
			
			
		}
		



