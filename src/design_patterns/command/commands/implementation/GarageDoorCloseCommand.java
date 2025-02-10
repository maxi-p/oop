package design_patterns.command.commands.implementation;

import design_patterns.command.commands.Command;
import design_patterns.command.items.GarageDoor;

public class GarageDoorCloseCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.stop();
        garageDoor.up();
    }
}
