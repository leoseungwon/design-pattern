package CommandPattern.ConcreteCommand;

import CommandPattern.Command.Button;
import CommandPattern.Receiver.Light;

public class LightOffButton implements Button {
    Light light;

    public LightOffButton(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
