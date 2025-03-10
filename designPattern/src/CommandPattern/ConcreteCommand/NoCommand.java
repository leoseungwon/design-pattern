package CommandPattern.ConcreteCommand;

import CommandPattern.Command.Button;

public class NoButton implements Button {
    public void execute() {
        System.out.println("No command");
    }

    @Override
    public void undo() {
        System.out.println("No command");
    }
}
