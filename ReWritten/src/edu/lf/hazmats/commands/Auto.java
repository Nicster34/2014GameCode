/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.lf.hazmats.commands;
import edu.wpi.first.wpilibj.Timer;
/**
 *
 * @author Owner
 */
public class Auto extends CommandBase{
     public Auto() {
        // Use requires() here to declare subsystem dependencies
        requires(driveTrain);
        requires(armMotor);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
       if (driveTrain.ultraValue() > 2){
        driveTrain.roboDrive(.5, driveTrain.gyroValue()*.03);
       }
       else {
        driveTrain.roboDrive(0,0);
        armMotor.intakeDriveReverse();
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
    
