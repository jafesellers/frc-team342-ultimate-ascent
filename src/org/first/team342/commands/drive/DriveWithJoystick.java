/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.first.team342.commands.drive;

import edu.wpi.first.wpilibj.Joystick;
import org.first.team342.Controller;
import org.first.team342.OI;
import org.first.team342.commands.CommandBase;
import org.first.team342.subsystems.DriveCAN;

/**
 *
 * @author FIRST Team 342
 */
public class DriveWithJoystick extends CommandBase {
    private DriveCAN drive = DriveCAN.getInstance();
    private Controller joystick;
    
    public DriveWithJoystick() {
        requires(drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        OI oi = OI.getInstance();
        this.joystick = oi.getDriveController();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //this.drive.driveWithJoystick(joystick);
        this.drive.driveWithJoystick(this.joystick);
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
