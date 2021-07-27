package com.github.gaboso.behavior.command.concrete;

import com.github.gaboso.behavior.command.Command;
import com.github.gaboso.behavior.command.receiver.Light;

public class OnCommand implements Command {

    private Light light;

    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
