package CommandPattern.ConcreteCommand;

import CommandPattern.Command.Button;
import CommandPattern.Receiver.GarageDoor;

public class GarageDoorClose implements Button {
    GarageDoor garageDoor;

    public GarageDoorClose(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.down();
    }
}
