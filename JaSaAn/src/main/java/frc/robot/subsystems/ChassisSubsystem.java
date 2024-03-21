// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
//import frc.robot.RobotMap;

public class ChassisSubsystem extends SubsystemBase {
  /** Creates a new ChassisSubsystem. */


    Encoder left_Encoder;

    WPI_VictorSPX left_front_motor; 
    WPI_VictorSPX left_chassis_motor2;
    WPI_VictorSPX left_chassis_motor3;

    Encoder right_Encoder;

    WPI_VictorSPX right_front_motor;
    WPI_VictorSPX right_chassis_motor2;
    WPI_VictorSPX right_chassis_motor3;


    DifferentialDrive drive; 

  public ChassisSubsystem() {

    this.left_front_motor = new WPI_VictorSPX(10);
    this.left_chassis_motor2 = new WPI_VictorSPX(11);
    this.left_chassis_motor3 = new WPI_VictorSPX(12);

    left_chassis_motor2.follow(left_front_motor);
    left_chassis_motor3.follow(left_chassis_motor3);

    this.right_front_motor = new WPI_VictorSPX(20);
    this.right_chassis_motor2 = new WPI_VictorSPX(21);
    this.right_chassis_motor3 = new WPI_VictorSPX(22);


    right_chassis_motor2.follow(right_front_motor);
    right_chassis_motor3.follow(right_front_motor);
    
    drive = new DifferentialDrive(left_front_motor, right_front_motor);

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
        drive.arcadeDrive(speed, turn);
       } 
}
