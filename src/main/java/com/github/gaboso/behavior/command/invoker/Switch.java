package com.github.gaboso.behavior.command.invoker;

import com.github.gaboso.behavior.command.Command;

public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }

}
