package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.Drivetrain;

@TeleOp
public class DcMotorPractice extends OpMode {
    Drivetrain drivetrain = new Drivetrain();

    public void init(){
        drivetrain.init(hardwareMap);

    }

    public void loop(){
        double speed = gamepad1.left_stick_y/-1;
        drivetrain.setMotorSpeed(speed);
    }
}
