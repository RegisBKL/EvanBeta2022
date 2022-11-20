// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.BackShooter;
import frc.robot.subsystems.Chute;
import frc.robot.subsystems.Intake;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class BackShooterReverseCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final BackShooter m_backshooter;
  ///private final double m_speed;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public BackShooterReverseCommand(BackShooter backShooter) {
    m_backshooter = backShooter;
    ///m_speed = speed;
    
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_backshooter);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
   // System.out.println("in initialize");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_backshooter.tourneSensHoraire();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_backshooter.mettreAuRepos();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
