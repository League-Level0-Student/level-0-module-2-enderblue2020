//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
public static void main(String[] args) {
	Random ran = new Random();

	// 2. Get the user to enter a question for the 8 ball to answer
	
JOptionPane.showInputDialog("Ask the magic 8 ball!!");
	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
int rand = ran.nextInt(3);
	
	// 4. If the random number is 0
if(rand == 0) {
	// -- tell the user "Yes"
JOptionPane.showMessageDialog(null, "Yes");
}
	// 5. If the random number is 1
if(rand == 1) {
	// -- tell the user "No"
JOptionPane.showMessageDialog(null, "No");
}
	// 6. If the random number is 2
if(rand == 2) {
JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
}
	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3
if(rand == 3) {
JOptionPane.showMessageDialog(null, "69 I don't know 69");
}
	// -- write your own answer

	}
}
