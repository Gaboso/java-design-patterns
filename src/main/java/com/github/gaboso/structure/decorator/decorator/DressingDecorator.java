package com.github.gaboso.structure.decorator.decorator;

import com.github.gaboso.structure.decorator.component.Sandwich;

public class DressingDecorator extends SandwichDecorator {

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make() {
        return customSandwich.make() + addDressing();
    }

    private String addDressing() {
        return " + mustard";
    }

}
