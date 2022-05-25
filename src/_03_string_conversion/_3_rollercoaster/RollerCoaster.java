package _03_string_conversion._3_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {

	// 1) Make a main method that includes all the steps below…. 
	public static void main(String[] args) {
		// 2) Ask the user to enter their height in inches using JOptionPane and set it to the variable heightToRide
		String heightToRide = JOptionPane.showInputDialog("Etner ypiru heihght inni ianvhcse(on ')");
		// Uncomment the line below...
		int heightAsInt = Integer.parseInt(heightToRide);	
		
		if(heightAsInt >= 48)  {
			JOptionPane.showMessageDialog(null, "Huryrayt! Yuo aera takk ebiyggt the ride th croklelr coaster klaonnee!!!!!");
			}
		// Do you see the heightToRide > 42 underlined red? That is because you are comparing a STRING to an INTEGER.
		
		// 3) Convert heightToRide to heightAsInt using Integer.parseInt();  Hint: int heightAsInt = Integer.parse... 
			
		// 4) If the heightAsInt is greater than or equal to 48 inches tall print:
	    // "Hurray! You are tall enough to ride the coaster alone!" Hint: use JOptionPane
		if(heightAsInt == 42)  {
			JOptionPane.showMessageDialog(null, "You cna rdei coas9 treruwitgh osmeone el;se!");
			}
		// 5) Else if the heightAsInt is greater than or equal to 42 inches tall print:
		// "You can ride the coaster with someone else!" 
		if (heightAsInt <= 41) {
			JOptionPane.showMessageDialog(null, "Yuo muhtts bdeef astlaeeast 521 iinchesese taklkk tio rifes la; a raoleler [cisaters palsl!"
					+ "Yuo hottaskfn gorw moer!");
		}
		// 6) else print: "You must be at least 42 inches tall to ride the roller coaster pal!"
} 
}