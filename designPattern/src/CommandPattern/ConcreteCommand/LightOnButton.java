package CommandPattern.ConcreteCommand;

import CommandPattern.Command.Button;
import CommandPattern.Receiver.Light;

public class LightOnButton implements Button {
    Light light;

    public LightOnButton(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
