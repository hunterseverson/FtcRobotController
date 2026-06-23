package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class GamepadPractice extends OpMode {

    @Override
    public void init(){

    }

    @Override
    public void loop(){
        //runs 50x a second
        telemetry.addData("x", gamepad1.left_stick_x);
        telemetry.addData("y", gamepad1.left_stick_y/-1);
        telemetry.addData("A", gamepad1.a);
    }
}
