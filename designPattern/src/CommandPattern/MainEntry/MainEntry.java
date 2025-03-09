package CommandPattern.MainEntry;

import CommandPattern.Command.Button;
import CommandPattern.ConcreteCommand.LightOnButton;
import CommandPattern.Invoker.CommandController;
import CommandPattern.Receiver.CeilingFan;
import CommandPattern.Receiver.GarageDoor;
import CommandPattern.Receiver.Light;
import CommandPattern.ConcreteCommand.LightOffButton;
import CommandPattern.ConcreteCommand.CeilingFanOnButton;
import CommandPattern.ConcreteCommand.CeilingFanOffButton;
import CommandPattern.ConcreteCommand.GarageDoorOpen;
import CommandPattern.ConcreteCommand.GarageDoorClose;


public class MainEntry {
    public static void main(String[] args) {
        CommandController commandController = new CommandController();
        Light light = new Light();
        CeilingFan ceilingFan = new CeilingFan();
        GarageDoor garageDoor = new GarageDoor();

       

        Button lightOn = new LightOnButton(light);
        Button lightOff = new LightOffButton(light);
        commandController.setCommand(0, lightOn, lightOff);

        Button ceilingFanOn = new CeilingFanOnButton(ceilingFan);
        Button ceilingFanOff = new CeilingFanOffButton(ceilingFan);
        commandController.setCommand(1, ceilingFanOn, ceilingFanOff);

        Button garageDoorOpen = new GarageDoorOpen(garageDoor);
        Button garageDoorClose = new GarageDoorClose(garageDoor);
        commandController.setCommand(2, garageDoorOpen, garageDoorClose);

        System.out.println(commandController);

        commandController.onButtonWasPushed(0);
        commandController.offButtonWasPushed(0);

        commandController.onButtonWasPushed(1);
        commandController.offButtonWasPushed(1);

        commandController.onButtonWasPushed(2);
        commandController.offButtonWasPushed(2);
        
        
        
        
    }
}
