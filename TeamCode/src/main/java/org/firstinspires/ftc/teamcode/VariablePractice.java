package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {
        int teamNumber = 10523;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String name = "Hunter";

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("claw Closed", clawClosed);
        telemetry.addData("name", name);
    }

    @Override
    public void loop() {

    }
}
