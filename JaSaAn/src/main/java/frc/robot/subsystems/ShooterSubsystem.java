// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;



public class ShooterSubsystem extends SubsystemBase {
  /** Creates a new ShooterSubsystem. */
  
  WPI_VictorSPX shooterMotor;
  public ShooterSubsystem() {
    shooterMotor = new WPI_VictorSPX(50);

  }

  public void shoot() {
    shooterMotor.set(1);
    
  }

  public void customShoot(double motorSpeed) {
    shooterMotor.set(motorSpeed);

  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
