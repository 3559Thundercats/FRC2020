/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveBaseSubsystem;

public class PIDLeftCommand extends CommandBase {
  private final DriveBaseSubsystem driveBaseSubsystem;

  /**
   * Creates a new PIDLeftCommand.
   */
  public PIDLeftCommand(final DriveBaseSubsystem subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    driveBaseSubsystem = subsystem;
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    int pov = RobotContainer.pov();

    if(pov == 0) { //left turn
      driveBaseSubsystem.manualDrive(-0.22, -0.22);
    }
    else if(pov == 180) {
      driveBaseSubsystem.manualDrive(0.22, 0.22);
    }
    else if(pov == 90) {
      driveBaseSubsystem.manualDrive(-0.22, 0.22);
    }
    else if(pov == 270) {
      driveBaseSubsystem.manualDrive(0.22, -0.22);
    }
    

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
