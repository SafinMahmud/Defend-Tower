package defendTower;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;



public class GameSound {
public static void missileHit(){
	try{
		File sound = new File("sound//missile.wav");
		AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
		Clip clip = AudioSystem.getClip();
		clip.open(ais);
		clip.start();
		
		
	}catch(Exception e){}
}
public static void planeHit(){
	try{
		File sound1 = new File("sound//b.wav");
		AudioInputStream ais = AudioSystem.getAudioInputStream(sound1);
		Clip clip = AudioSystem.getClip();
		clip.open(ais);
		clip.start();
		
		
	}catch(Exception e){}
}
}
