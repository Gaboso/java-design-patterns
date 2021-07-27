package com.github.gaboso.behavior.mediator;

import com.github.gaboso.behavior.mediator.command.Command;
import com.github.gaboso.behavior.mediator.command.TurnOffAllLightsCommand;
import com.github.gaboso.behavior.mediator.command.TurnOnAllLightsCommand;
import com.github.gaboso.behavior.mediator.receiver.Light;

public class MediatorMain {


    public static void main(String[] args) {
        var mediator = new Mediator();

        var bedroomLight = new Light("Bedroom");
        var kitchenLight = new Light("Kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        turnOnAllLightsCommand.execute();

        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
        turnOffAllLightsCommand.execute();
    }

}
