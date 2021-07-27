package com.github.gaboso.behavior.mediator.command;

import com.github.gaboso.behavior.mediator.Mediator;

public class TurnOffAllLightsCommand implements Command {

    private final Mediator mediator;

    public TurnOffAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }

}
