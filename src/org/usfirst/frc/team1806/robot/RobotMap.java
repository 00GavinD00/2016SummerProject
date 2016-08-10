package org.usfirst.frc.team1806.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	public static int leftX = 1,
			leftY = 2,
			triggers = 3, //Right - left
			rightX = 4,
			rightY = 5,
			dPadX = 6, //Left to Right
			dPadY = 7; //Check this number
	
	public static int btnA = 1,
			btnB = 2,
			btnX = 3,
			btnY = 4;
}
