// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class IndexSubsystem extends SubsystemBase {
  
  //Declares the motors' existence 
  WPI_VictorSPX indexMotor;


  //creates the object
  public IndexSubsystem() {
    indexMotor = new WPI_VictorSPX(1000);
  }


  /**
   * Sets the motor speed to negative when it needs to go backwards
   */
  public void indexBackwards() {

    indexMotor.set(-1);
    
  }
  /**
   * Exact opposite of backward motor speed - makes it go forwards when it needs to go forwards
   */
  public void indexForwards() {

    indexMotor.set(1);

  }

  /**
   * Indexer needs to stop moving at one point, so the code stops the motor. 
   */
  public void indexStop() {

    indexMotor.set(0);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }



}
