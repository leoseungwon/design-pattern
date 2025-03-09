package CommandPattern.ConcreteCommand;

import CommandPattern.Command.Button;
import CommandPattern.Receiver.CeilingFan;

public class CeilingFanOnButton implements Button {
    CeilingFan ceilingFan;

    public CeilingFanOnButton(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }
}