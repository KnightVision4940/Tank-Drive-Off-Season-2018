package org.usfirst.frc.team4940.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain {

	static DifferentialDrive m_drive;
	static double rspeed;
	public static SpeedControllerGroup m_left;
	public static SpeedControllerGroup m_right;

	public static void initDriveTrain(int frontLeft,int backLeft,int frontRight, int backRight) {

		WPI_TalonSRX m_frontLeft = new WPI_TalonSRX(frontLeft);
		//m_frontLeft.setSafetyEnabled(false);
		WPI_TalonSRX m_rearLeft = new WPI_TalonSRX(backLeft);
		//m_rearLeft.setSafetyEnabled(false);
		m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);

		WPI_TalonSRX m_frontRight = new WPI_TalonSRX(frontRight);
		//m_frontRight.setSafetyEnabled(false);
		WPI_TalonSRX m_rearRight = new WPI_TalonSRX(backRight);
		//m_rearRight.setSafetyEnabled(false);
		m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);
	

		m_drive = new DifferentialDrive(m_left, m_right);
		//m_drive.isSafetyEnabled();

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