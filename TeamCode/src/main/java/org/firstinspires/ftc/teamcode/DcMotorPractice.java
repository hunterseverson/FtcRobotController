package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.Drivetrain;
@Disabled
@TeleOp
public class DcMotorPractice extends OpMode {
    Drivetrain drivetrain = new Drivetrain();

    public void init(){
        drivetrain.init(hardwareMap);

    }

    public void loop(){
        double leftSpeed = gamepad1.left_stick_y/-1;
        double rightSpeed = gamepad1.right_stick_y/-1;
        drivetrain.setMotorSpeed(leftSpeed, rightSpeed);
    }
}
