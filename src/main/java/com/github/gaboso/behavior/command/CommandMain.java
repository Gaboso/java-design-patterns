package com.github.gaboso.behavior.command;

import com.github.gaboso.behavior.command.concrete.AllLightsCommand;
import com.github.gaboso.behavior.command.concrete.ToggleCommand;
import com.github.gaboso.behavior.command.invoker.Switch;
import com.github.gaboso.behavior.command.receiver.Light;

import java.util.ArrayList;
import java.util.List;

public class CommandMain {

    public static void main(String[] args) {
        var bedroomLight = new Light();
        var kitchenLight = new Light();
        var lightSwitch = new Switch();

        Command onCommand = new ToggleCommand(bedroomLight);
        for (var i = 0; i < 1; i++) {
            lightSwitch.storeAndExecute(onCommand);
        }

        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedroomLight);

        Command allLightsCommand = new AllLightsCommand(lights);
        lightSwitch.storeAndExecute(allLightsCommand);
    }

}
