/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

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

  //CANbus
  //right motors
  public static int CANDeviceID1 = 16;
  public static int CANDeviceID2 = 17;
  public static int CANDeviceID3 = 18;
  //left motors
  public static int CANDeviceID4 = 19;
  public static int CANDeviceID5 = 20;
  public static int CANDeviceID6 = 21;

  //USB
  public static int joystickPort1 = 0;
  //public static int joystickPort2 = 1;

  //Constants
  //public static int wheelDiameter = 6;
}
