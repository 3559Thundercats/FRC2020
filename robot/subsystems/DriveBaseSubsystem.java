/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import frc.robot.RobotMap;
import frc.robot.commands.ManualDriveCommand;

import com.revrobotics.*;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax.IdleMode;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

/**
 * Add your docs here.
 */
public class DriveBaseSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  // instantiate new motor controller objects
  //right motors
  public CANSparkMax motorA = new CANSparkMax(RobotMap.CANDeviceID1, MotorType.kBrushless);
  public CANSparkMax motorB = new CANSparkMax(RobotMap.CANDeviceID2, MotorType.kBrushless);
  public CANSparkMax motorC = new CANSparkMax(RobotMap.CANDeviceID3, MotorType.kBrushless);

  //left motors
  public CANSparkMax motorD = new CANSparkMax(RobotMap.CANDeviceID4, MotorType.kBrushless);
  public CANSparkMax motorE = new CANSparkMax(RobotMap.CANDeviceID5, MotorType.kBrushless);
  public CANSparkMax motorF = new CANSparkMax(RobotMap.CANDeviceID6, MotorType.kBrushless);

  //fix motors to a speed controller group
  SpeedControllerGroup spc_right = new SpeedControllerGroup(motorA, motorB, motorC);
  SpeedControllerGroup spc_left = new SpeedControllerGroup(motorD, motorE, motorF);
  
// instantiate a new DifferentialDrive object pass motor controllers as arguments
public DifferentialDrive drivetrain = new DifferentialDrive(spc_left, spc_right);



// add manualDrive() method
public void manualDrive(double leftStick, double rightStick) {

  drivetrain.tankDrive(leftStick, rightStick);

}


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ManualDriveCommand());
  }
}
