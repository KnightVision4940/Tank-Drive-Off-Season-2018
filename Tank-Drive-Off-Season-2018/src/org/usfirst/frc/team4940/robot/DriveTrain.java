package org.usfirst.frc.team4940.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain {

	static DifferentialDrive m_drive;
	static double rspeed;
	public static SpeedControllerGroup m_left;
	public static SpeedControllerGroup m_right;

	public static void initDriveTrain(int frontLeft, int frontRight, int backLeft, int backRight) {

		WPI_TalonSRX m_frontLeft = new WPI_TalonSRX(frontLeft);
		WPI_TalonSRX m_rearLeft = new WPI_TalonSRX(backLeft);
		m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);

		WPI_TalonSRX m_frontRight = new WPI_TalonSRX(frontRight);
		WPI_TalonSRX m_rearRight = new WPI_TalonSRX(backRight);
		m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);
	

		m_drive = new DifferentialDrive(m_left, m_right);

	}

	public static void driveForward(double speed, double turn) {
		rspeed = m_left.get();
		if(speed > 0){
			m_drive.tankDrive(speed, turn, false);
		}

	}
	public static void driveBackward(double speed, double turn) {
		rspeed = m_left.get();
		if(speed < 0){
			m_drive.tankDrive(speed, turn, false);
		}

	}

}