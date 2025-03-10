package CommandPattern.Invoker;

import CommandPattern.Command.Button;
import CommandPattern.ConcreteCommand.NoButton;

public class CommandController {
    Button[] onButtons;
    Button[] offButtons;
    Button undoButtons;

    public CommandController() {
        onButtons = new Button[7];
        offButtons = new Button[7];

        Button noButton = new NoButton();
        for (int i = 0; i < 7; i++) {
            onButtons[i] = noButton;
            offButtons[i] = noButton;
        }
        undoButtons = noButton;
    }

    public void setCommand(int slot, Button onButton, Button offButton) {
        onButtons[slot] = onButton;
        offButtons[slot] = offButton;
    }

    public void onButtonWasPushed(int slot) {
        onButtons[slot].execute();
        undoButtons = onButtons[slot];
    }

    public void offButtonWasPushed(int slot) {
        offButtons[slot].execute();
        undoButtons = offButtons[slot];
    }

    public void undoButtonWasPushed() {
        undoButtons.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onButtons.length; i++) {
            stringBuff.append("[slot " + i + "] " + onButtons[i].getClass().getName() + "    "
                    + offButtons[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
