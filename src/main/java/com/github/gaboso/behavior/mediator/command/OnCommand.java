package com.github.gaboso.behavior.mediator.command;

import com.github.gaboso.behavior.mediator.receiver.Light;

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
