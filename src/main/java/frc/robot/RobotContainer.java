// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.WCPTeleopDrive;
import frc.robot.subsystems.WCPDriveTrain;

public class RobotContainer {
  private final WCPDriveTrain driveTrain = new WCPDriveTrain();

  CommandXboxController controller = new CommandXboxController(0);

  public RobotContainer() {
    configureBindings();
    driveTrain.setDefaultCommand(new WCPTeleopDrive(controller, driveTrain));
  }

  private void configureBindings() {}

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
