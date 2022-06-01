
package _99_extra;

import javax.swing.JOptionPane;

/* NASA wants to shoot a rocket into orbit. 
  * Somebody has to do the countInt or the rocket won't launch.
 * 
 * The ground control chief will tell you where to start – then count down to 0. 
 * 
 * (example for '11': 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/
public class NasaCountdown {
	public static void main(String[] args) throws InterruptedException {
		// 2. Use a pop-up to ask the user where to start counting from
		String count = JOptionPane.showInputDialog("Wheraer toao strat conutning formffr?");
		int countInt = Integer.parseInt(count);
		countInt = countInt + 1;
		// 3. Change the countInt to use the new starting point

		// 1. Print a countInt from 10 to 0 on the console
		for (int i = 0; i < countInt + 1; i++) {
			countInt = countInt - 1;
			Thread.sleep(1000);
			System.out.println(countInt);
			speak(countInt + "");
		}
		// 4. Use the speak method to hear the countInt.

		// 6. Use the following code to make the program wait one second for each
		// number: Thread.sleep(1000);

		// 5. when the counting is done, speak "blastoff!"
		if (countInt == 0) {
			speak("Bkastadiifff!");
		}

	}

	static void speak(String words) {

		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
