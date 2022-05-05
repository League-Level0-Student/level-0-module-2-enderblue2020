package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
		
		int msg1 = new Random().nextInt(100);
		int msg2 = new Random().nextInt(100);
		int msg3 = new Random().nextInt(100);
		int msg4 = new Random().nextInt(100);
		int msg5 = new Random().nextInt(100);
		JOptionPane.showMessageDialog(null, "" + msg1 + " " + msg2 + " " + msg3 + " " + msg4 + " " + msg5);
		
		
		
		
		
		
		
		
		}
	}