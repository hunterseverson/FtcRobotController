package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.mechanisms.LeftDrivetrain;
import org.firstinspires.ftc.teamcode.mechanisms.RightDrivetrain;

@TeleOp
public class TankDrive extends OpMode {
    LeftDrivetrain leftDrivetrain = new LeftDrivetrain();
    RightDrivetrain rightDrivetrain = new RightDrivetrain();
    public void init(){
        leftDrivetrain.init(hardwareMap);
        rightDrivetrain.init(hardwareMap);
    }

    public void loop(){
        double rightSpeed = gamepad1.left_stick_y/-1;
        double leftSpeed = gamepad1.right_stick_y;

        leftDrivetrain.setMotorSpeed(leftSpeed);
        rightDrivetrain.setMotorSpeed(rightSpeed);
}
}