package com.github.gaboso.behavior.mediator;

import com.github.gaboso.behavior.mediator.command.Command;
import com.github.gaboso.behavior.mediator.command.TurnOffAllLightsCommand;
import com.github.gaboso.behavior.mediator.command.TurnOnAllLightsCommand;
import com.github.gaboso.behavior.mediator.receiver.Light;

public class MediatorDemo {


    public static void main(String[] args) {
       Mediator mediator = new Mediator();

        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        turnOnAllLightsCommand.execute();

        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
        turnOffAllLightsCommand.execute();
    }

}
