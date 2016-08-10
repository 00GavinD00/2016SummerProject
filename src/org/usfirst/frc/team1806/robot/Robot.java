
package org.usfirst.frc.team1806.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Robot extends IterativeRobot {

	public static OI oi;

    Command autonomousCommand;
    SendableChooser autoChooser;
    
    SendableChooser testMotor;

   
    public void robotInit() {
		oi = new OI();
        autoChooser = new SendableChooser();        
        SmartDashboard.putData("Auto mode", autoChooser);
    }
    
    
    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        autonomousCommand =  (Command) autoChooser.getSelected();
        
		/* String autoSelected = SmartDashboard.getString("Auto Selector", "Default");
		switch(autoSelected) {
		case "My Auto":
			autonomousCommand = new MyAutoCommand();
			break;
		case "Default Auto":
		default:
			autonomousCommand = new ExampleCommand();
			break;
		} */
    	
    	// schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
       
    }
    
    //Don't mess with this, doesn't do anything.
    public void testPeriodic() {
        LiveWindow.run();
    }
}
