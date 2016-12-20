package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot bender=new Robot();
		bender.penDown();
		bender.setSpeed(10);
		for (int j = 0; j < 75; j++) {
			bender.setRandomPenColor();
		bender.move(5*j);
		bender.turn(360/5);
		bender.setPenWidth(1);
		}
	}
}
