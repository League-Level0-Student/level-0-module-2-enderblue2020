
package _99_extra;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThatWasEasy extends MouseAdapter {

	public void mouseClicked(MouseEvent arg0) {
		/* Use the speak method to make the button work. */
		speak("1 2 55 39 5 10 58 97 54 72 56 99 73 67 16 43 36 41 18 60 99 28 65 81 11 47 85 56 27 77 75 61 65 46 90 66 81 95 4 14 53 22 51 46 71 20 99 93 97 46 38 23 78 100 15 91 6");
	speak("Not every story has to have significance, ya know? Sometimes uhh, you know, sometimes a story is just a story. You try to read into every little thing and find meaning in everything anyone says, you’ll just drive yourself crazy. Had a friend do it once - wasn’t pretty - we talked about it for years.");
	}

	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ThatWasEasy();

	}

	public ThatWasEasy() {
		showEasyButton();
		easyButtonImage.addMouseListener(this);

	}

	JLabel easyButtonImage;

	private void showEasyButton() {
		JFrame quizWindow = new JFrame();
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizWindow.setVisible(true);

		Icon icon = new ImageIcon(getClass().getResource("easy_button.jpg"));
		this.easyButtonImage = new JLabel(icon);
		quizWindow.add(easyButtonImage);
		quizWindow.pack();
		
	}

}


