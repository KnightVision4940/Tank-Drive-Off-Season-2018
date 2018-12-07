package org.usfirst.frc.team4940.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain {

	static DifferentialDrive m_drive;
	static double rspeed;

	public DriveTrain(int frontLeft, int frontRight, int backLeft, int backRight) {

		WPI_TalonSRX m_frontLeft = new WPI_TalonSRX(frontLeft);
		WPI_TalonSRX m_rearLeft = new WPI_TalonSRX(backLeft);
		SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);

		WPI_TalonSRX m_frontRight = new WPI_TalonSRX(frontRight);
		WPI_TalonSRX m_rearRight = new WPI_TalonSRX(backRight);
		SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);

		m_drive = new DifferentialDrive(m_left, m_right);

	}

	public static void drive(double speed, double turn) {
		rspeed = speed;
		m_drive.tankDrive(speed, turn, false);

	}

}