package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
public class LeftDrivetrain {
    private DcMotor frontLeft;
    private DcMotor backLeft;


    public void init(HardwareMap hwMap) {
        frontLeft = hwMap.get(DcMotor.class, "front_left");
        frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        backLeft = hwMap.get(DcMotor.class, "back_left");
        backLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void setMotorSpeed(double leftSpeed){
        frontLeft.setPower(leftSpeed);
        backLeft.setPower(leftSpeed);
    }

}
