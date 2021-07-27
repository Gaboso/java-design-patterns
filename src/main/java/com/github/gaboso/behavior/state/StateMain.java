package com.github.gaboso.behavior.state;

import com.github.gaboso.behavior.state.state.Fan;

public class StateMain {

    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);
    }

}
