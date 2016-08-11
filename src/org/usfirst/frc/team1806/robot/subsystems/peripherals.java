package org.usfirst.frc.team1806.robot.subsystems;

import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team1806.robot.commands.*;
import com.kauailabs.navx.frc.AHRS;
/**
 *
 */
public class peripherals extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.


	AHRS navX = new AHRS(SPI.Port.kMXP); /* Alternatives:  SPI.Port.kMXP, I2C.Port.kMXP or SerialPort.Port.kUSB */
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public double getCurrentAngle(){
    	return navX.getAngle();
    }
    
    public double getSpeedForward(){
    	return navX.getVelocityY(); //Meters per second
    } 
}

