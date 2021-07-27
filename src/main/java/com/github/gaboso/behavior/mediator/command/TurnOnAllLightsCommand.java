package com.github.gaboso.behavior.mediator.command;

import com.github.gaboso.behavior.mediator.Mediator;

public class TurnOnAllLightsCommand implements Command {

    private Mediator mediator;

    public TurnOnAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }


}
