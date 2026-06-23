package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {
        int teamNumber = 10523;
        double driveSpeed = 0.7;
        boolean clawClosed = true;
        String name = "Hunter";

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Drive Speed", driveSpeed);
        telemetry.addData("Claw Closed?", clawClosed);
        telemetry.addData("Name", name);
}

    public void loop() {
    }
}