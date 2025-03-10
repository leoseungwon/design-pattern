package CommandPattern.ConcreteCommand;

import CommandPattern.Command.Button;
import CommandPattern.Receiver.CeilingFan;

public class CeilingFanOffButton implements Button {
    CeilingFan ceilingFan;

    public CeilingFanOffButton(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.on();
    }
}
