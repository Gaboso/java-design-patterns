package com.github.gaboso.behavior.state.state;

public class FanHighState extends State {

    private Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan off.");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Fan is High.";
    }
}

