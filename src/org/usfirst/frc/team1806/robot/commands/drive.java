package org.usfirst.frc.team1806.robot.commands;

import org.usfirst.frc.team1806.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class drive extends Command {
	
	double deadZone = 0.2; 
	
    public drive() {
    	requires(Robot.driveSS);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.oi.getMainDriverLYAxis() > deadZone || Robot.oi.getMainDriverRXAxis() > deadZone){
    		Robot.driveSS.drive(Robot.oi.getMainDriverLYAxis(), Robot.oi.getMainDriverRXAxis());
    	} else {
    		Robot.driveSS.drive(0, 0);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
