package musictrial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;





public class music {
	public static void main(String args[])
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("Mfg.mp3");
			Player player=new Player(fileinputstream);
			player.play();
			System.out.println("song is playing");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
		
	}
	
	

}
