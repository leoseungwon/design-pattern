package CommandPattern.ConcreteCommand;

import CommandPattern.Command.Button;
import CommandPattern.Receiver.GarageDoor;

public class GarageDoorOpen implements Button {
    GarageDoor garageDoor;

    public GarageDoorOpen(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
