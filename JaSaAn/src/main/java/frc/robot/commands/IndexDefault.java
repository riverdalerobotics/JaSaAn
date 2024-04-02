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
  IndexSubsystem index;
//creating the objects for the code to use
 
  public IndexDefault(OI oi, IndexSubsystem index) {
   this.oi = oi;
   this.index = index;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

   //If the oi receives the input that equals moving forward, the robot motor will be set to +1
    if (oi.indexForwards()) {
     
      index.indexForwards();
      // if not pressed, it will check if the button for moving backwards was pressed. 
    } else if (oi.indexBackwards()) {

      index.indexBackwards();
      
    } else {
      //Finally, if no buttons are being pressed, the index is to stop. 
      index.indexStop();

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
