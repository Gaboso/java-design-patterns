package com.github.gaboso.behavior.command.concrete;

import com.github.gaboso.behavior.command.Command;
import com.github.gaboso.behavior.command.receiver.Light;

public class ToggleCommand implements Command {

    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }

}
