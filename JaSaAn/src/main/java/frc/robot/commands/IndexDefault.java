// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.IndexSubsystem;




public class IndexDefault extends Command {
  OI oi;
  XboxController operatorController;
  IndexSubsystem index;
//creating the objects for the code to use
 
  public IndexDefault() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

   
    if (operatorController.getAButtonPressed()) {
     
      index.indexForwards();

    } else if (operatorController.getBButtonPressed()) {

      index.indexBackwards();
    } 

  }

  
  

 
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
