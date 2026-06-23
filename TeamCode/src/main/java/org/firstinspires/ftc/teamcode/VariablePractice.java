package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {
        int teamNumber = 10523;
        boolean clawClosed = true;
        String name = "Hunter";

        telemetry.addData("Team Number", teamNumber);
}

    public void loop() {
    }
}