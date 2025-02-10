package design_patterns.command;

import design_patterns.command.commands.Command;
import design_patterns.command.commands.implementation.*;
import design_patterns.command.items.CeilingFan;
import design_patterns.command.items.GarageDoor;
import design_patterns.command.items.Light;
import design_patterns.command.items.Stereo;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        // Macros (Multiple Commands)
        Command[] partyOn = { livingRoomLightOn, stereoOnWithCD };
        Command[] partyOff = { livingRoomLightOff, stereoOff };
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        // Insead of using these classes, we can use Java lambda expressions
        // Only works when there is one abstract method. As soon as we add second, it doesn't work.
        // Because of the undo command, this breaks
        //      remoteControl.setCommand(0, () -> livingRoomLight.on(), () -> livingRoomLight.off());
        //      remoteControl.setCommand(1, () -> kitchenLight.on(), () -> kitchenLight.off());
        //      remoteControl.setCommand(2, () -> garageDoor.up(), () -> garageDoor.down());
        // Or can even use method reference when there is a single method without input
        //      remoteControl.setCommand(3, () -> { stereo.on(); stereo.setCd(); stereo.setVolume(11);}, stereo::off);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, garageDoorOpen, garageDoorClose);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setCommand(5, ceilingFanLowCommand, ceilingFanOffCommand);
        remoteControl.setCommand(6, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        remoteControl.onButtonWasPushed(4);
        remoteControl.onButtonWasPushed(5);
        remoteControl.undoButtonWasPushed();

        // TODO: use case of COMMAND - queuing requests
        // TODO: use case of COMMAND - logging requests
        // TODO: use case of COMMAND - Swing buttons
    }
}
