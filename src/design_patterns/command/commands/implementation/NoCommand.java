package design_patterns.command.commands.implementation;

import design_patterns.command.commands.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}
