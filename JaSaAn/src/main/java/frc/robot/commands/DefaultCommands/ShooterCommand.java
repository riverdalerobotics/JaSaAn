// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.DefaultCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.ShooterSubsystem;

public class ShooterCommand extends Command {
   ShooterSubsystem shootSubsystem;
   OI oi;
  /** Creates a new ShooterCommand. */
  public ShooterCommand(ShooterSubsystem shootSubsystem, OI oi) {
    this.oi = oi;
    this.shootSubsystem = shootSubsystem;
    addRequirements(shootSubsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    shootSubsystem.customShoot(oi.shooter());


  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
