package com.github.gaboso.structure.decorator.decorator;

import com.github.gaboso.structure.decorator.component.Sandwich;

public abstract class SandwichDecorator implements Sandwich {

    protected Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    public String make() {
        return customSandwich.make();
    }

}
