package com.github.gaboso.behavior.command.receiver;

public class Light {

    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    public void off() {
        System.out.println("Light switched off");
    }

    public void on() {
        System.out.println("Light switched on");
    }

}
