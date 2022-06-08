
package _99_extra;

import java.net.URI;
import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What is your mood??", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Sad", "Happy", "Angry",  "Spam can"}, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
		System.out.println("" + userMood);
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
		if(userMood == 2)
		{playVideo("https://bit.ly/video-for-happy");
		}
		if(userMood == 1)
		{playVideo("https://bit.ly/video-for-sad");
		}
		if(userMood == 3)
		{playVideo("https://bit.ly/video-for-angry");
		}
		if(userMood == 2)
		{playVideo("https://bit.ly/video-for-calm");
		}
		if(userMood == 4)
		{playVideo("https://www.youtube.com/watch?v=d8RkcUiCxuE");
		}
		// 4. Play different songs for other moods.



//bit.ly/video-for-happy
//bit.ly/video-for-sad
//bit.ly/video-for-angry

		
		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



