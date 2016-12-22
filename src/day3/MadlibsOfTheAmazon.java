package day3;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...

		// Get the user to enter an adjective
String adj=JOptionPane.showInputDialog("Give me an adjective");
		// Get the user to enter a type of liquid
String liquid=JOptionPane.showInputDialog("Give me a liquid");
		// Get the user to enter a body part
String bp=JOptionPane.showInputDialog("Give me a body part");
		// Get the user to enter a verb
String v=JOptionPane.showInputDialog("Give me a verb");
		// Get the user to enter a place
String pl=JOptionPane.showInputDialog("Give me a place");
		// 
		JOptionPane.showMessageDialog(null,"Piranhas are more " +adj+ 
				" during the day, so cross the river at night. Piranhas are attracted to fresh " +liquid+ 
				" and will most likely take a bite out of your " +bp+ " if you " +v+ 
				". "Whatever you do, if you have an open wound, try to find another way to get back to the" +pl+ ". Good luck!" );
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}

