package org.usfirst.frc.team1806.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;


public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	//Two driver joysticks
	public Joystick mainDriver = new Joystick(1);
	public Joystick secondaryDriver = new Joystick(2);
	
	//Buttons
	Button mainDriverA = new JoystickButton(mainDriver, RobotMap.btnA);
	Button mainDriverB = new JoystickButton(mainDriver, RobotMap.btnB);
	Button mainDriverX = new JoystickButton(mainDriver, RobotMap.btnX);
	Button mainDriverY = new JoystickButton(mainDriver, RobotMap.btnY);
	
	Button secondaryDriverA = new JoystickButton(secondaryDriver, RobotMap.btnA);
	Button secondaryDriverB = new JoystickButton(secondaryDriver, RobotMap.btnB);
	Button secondaryDriverX = new JoystickButton(secondaryDriver, RobotMap.btnX);
	Button secondaryDriverY = new JoystickButton(secondaryDriver, RobotMap.btnY);
	
	//Button based commands
	
	
	//All the analog sticks
	public double getMainDriverLXAxis(){
		return mainDriver.getRawAxis(RobotMap.leftX);
	}
	
	public double getMainDriverLYAxis(){
		return mainDriver.getRawAxis(RobotMap.leftY);
	}
	
	public double getMainDriverRXAxis(){
		return mainDriver.getRawAxis(RobotMap.rightX);
	}
	
	public double getMainDriverRYAxis(){
		return mainDriver.getRawAxis(RobotMap.rightY);
	}
	
	public double getMainDriverTriggers(){
		return mainDriver.getRawAxis(RobotMap.triggers);
	}
	
	public double getMainDriverDPadX(){
		return mainDriver.getRawAxis(RobotMap.dPadX);
	}
	
	public double getMainDriverDPadY(){
		return mainDriver.getRawAxis(RobotMap.dPadY);
	}
	
	public double getSecondaryDriverLXAxis(){
		return secondaryDriver.getRawAxis(RobotMap.leftX);
	}
	
	public double getSecondaryDriverLYAxis(){
		return secondaryDriver.getRawAxis(RobotMap.leftY);
	}
	
	public double getSecondaryDriverRXAxis(){
		return secondaryDriver.getRawAxis(RobotMap.rightX);
	}
	
	public double getSecondaryDriverRYAxis(){
		return secondaryDriver.getRawAxis(RobotMap.rightY);
	}
	
	public double getSecondaryDriverTriggers(){
		return secondaryDriver.getRawAxis(RobotMap.triggers);
	}
	
	public double getSecondaryDriverDPadX(){
		return secondaryDriver.getRawAxis(RobotMap.dPadX);
	}
	
	public double getSecondaryDriverDPadY(){
		return secondaryDriver.getRawAxis(RobotMap.dPadY);
	}
}

