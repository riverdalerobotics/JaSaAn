// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
//import frc.robot.RobotMap;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ChassisSubsystem extends SubsystemBase {
  /** Creates a new ChassisSubsystem. */
  WPI_VictorSPX rightMotorFront;
  WPI_VictorSPX rightMotor2;
  WPI_VictorSPX rightMotor3;

  WPI_VictorSPX leftFrontMotor;
  WPI_VictorSPX leftMotor2;
  WPI_VictorSPX leftMotor3;

  public ChassisSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
