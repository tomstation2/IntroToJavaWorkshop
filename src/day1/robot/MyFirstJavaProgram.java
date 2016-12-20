package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot bender=new Robot();
		bender.setPenColor(150, 255, 255);
		bender.penDown();
		bender.setSpeed(250);
		for (int i = 0; i < 4; i++) {
		bender.move(100);
		bender.turn(90);
		}
		bender.move(200);
		bender.turn(90);
		bender.move(100);
		bender.turn(90);
		bender.move(200);
		bender.turn(90);
		bender.move(200);
		bender.turn(90);
		bender.move(200);
		bender.turn(90);
		bender.move(100);
		bender

		

	
		
		
	}
}
