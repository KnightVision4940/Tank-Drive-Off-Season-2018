package org.usfirst.frc.team4940.robot;

import edu.wpi.first.wpilibj.Joystick;

public class JoyStick {
	Joystick joystick = new Joystick(0);
	
	public static double yAxis(){
		//This is to go forward or backward.
		//Change the number in the brackets to the appropriate axis.
		return joystick.getRawAxis(1);
	}
	
	public static double xAxis(){
		//This is to go left or right.
		//Change the number in the brackets to the appropriate axis.
		return joystick.getRawAxis(1);
	}
	
	
}
