package defendTower;
import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		
		GameBoard bk = new GameBoard();
		JFrame window = new JFrame();
		window.add(bk);
		window.setSize(1000, 600);
		window.setLocation(220, 50);
		window.setTitle("DefendTower");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		bk.startGame();
	}

}
