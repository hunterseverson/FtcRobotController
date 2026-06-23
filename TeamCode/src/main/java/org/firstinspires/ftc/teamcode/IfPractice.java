package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
@Disabled
public class IfPractice extends OpMode {
    @Override
    public void init(){

    }

    @Override
    public void loop(){
        double leftY = gamepad1.left_stick_y/-1;

        if(leftY < 0) {
            telemetry.addData("Left Stick", "is negative");
        }
        else if(leftY > 0) {
            telemetry.addData("Left Stick", "is positive");
        }
        else {
            telemetry.addData("Left Stick", "is neutral");
        }
    }
}
