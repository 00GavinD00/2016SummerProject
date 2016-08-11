package org.usfirst.frc.team1806.robot.subsystems;

import org.usfirst.frc.team1806.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import org.usfirst.frc.team1806.robot.commands.*;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class driveTrain extends Subsystem {
    Talon leftMtr1 = new Talon(RobotMap.leftMtr1),
    	leftMtr2 = new Talon(RobotMap.leftMtr2),
    	leftMtr3 = new Talon(RobotMap.leftMtr3);
    
    Talon rightMtr1 = new Talon(RobotMap.rightMtr1),
    		rightMtr2 = new Talon(RobotMap.rightMtr2),
    		rightMtr3 = new Talon(RobotMap.rightMtr3);
    
    RobotDrive driveTrain = new RobotDrive(leftMtr1, rightMtr1);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new drive());
    }
    
    public void drive(double move, double rotate){
    	driveTrain.arcadeDrive(move, rotate, true);
    	
    	leftMtr2.set(leftMtr1.get());
    	leftMtr3.set(leftMtr1.get());
    	
    	rightMtr2.set(rightMtr1.get());
    	rightMtr3.set(rightMtr1.get());
    }
}

