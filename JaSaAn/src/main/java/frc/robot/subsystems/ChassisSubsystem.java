// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Encoder;

//import frc.robot.RobotMap;

public class ChassisSubsystem extends SubsystemBase {
  /** Creates a new ChassisSubsystem. */


    Encoder left_Encoder;

    WPI_VictorSPX left_front_motor; 
    WPI_VictorSPX left_chassis_motor2;
    WPI_VictorSPX left_chassis_motor3;


    WPI_VictorSPX right_front_motor;
    WPI_VictorSPX right_chassis_motor2;
    WPI_VictorSPX right_chassis_motor3;
    WPI_VictorSPX thisistest;

  public ChassisSubsystem() {

      left_front_motor = new WPI_VictorSPX(10);
      left_chassis_motor2 = new WPI_VictorSPX(11);
      left_chassis_motor3 = new WPI_VictorSPX(12);


      right_front_motor =  new WPI_VictorSPX(20);
      right_chassis_motor2 = new WPI_VictorSPX(21);
      right_chassis_motor3 = new WPI_VictorSPX(22);


      public void driveChassis(double turn, double speed){
        double driveRight = turn +speed;
        double driveLeft = turn - speed;
        right_front_motor.set(driveRight);
        right_chassis_motor2.set(driveRight);
        right_chassis_motor3.set(driveRight);
        left_front_motor.set(driveLeft);
        left_chassis_motor2.set(driveLeft);
        left_chassis_motor3.set(driveLeft);
      }



  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }
  /**
   * this is a method for the moving of the robot yes
   * @param speed
   * @param turn
   */
       public void move (double speed, double turn){

       } 
}
