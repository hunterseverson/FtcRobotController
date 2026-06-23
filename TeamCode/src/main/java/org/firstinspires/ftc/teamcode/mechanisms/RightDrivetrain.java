package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
public class RightDrivetrain {
    private DcMotor frontRight;
    private DcMotor backRight;

    public void init(HardwareMap hwMap) {
        frontRight = hwMap.get(DcMotor.class, "front_right");
        frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        backRight = hwMap.get(DcMotor.class, "back_right");
        backRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void setMotorSpeed(double rightSpeed){
        frontRight.setPower(rightSpeed);
        backRight.setPower(rightSpeed);
    }


}
