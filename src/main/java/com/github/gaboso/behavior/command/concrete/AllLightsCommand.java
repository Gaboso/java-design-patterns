package com.github.gaboso.behavior.command.concrete;

import com.github.gaboso.behavior.command.Command;
import com.github.gaboso.behavior.command.receiver.Light;

import java.util.List;

public class AllLightsCommand implements Command {

    private List<Light> lights;

    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.forEach(light -> {
            if (light.isOn()) {
                light.toggle();
            }
        });
    }

}
