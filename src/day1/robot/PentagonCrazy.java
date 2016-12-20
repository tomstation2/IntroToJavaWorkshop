package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		
		Robot skree=new Robot();

		
		skree.penDown();

		skree.setSpeed(1000);

		skree.setPenColor(12, 45, 255);;

		int sides=1;

		int angle=251;

		for (int i = 0; i < 200000000; i++) {
				
		skree.move(200);
	
		skree.turn(angle);
	
			
		}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}