package com.github.gaboso.structure.decorator;

import com.github.gaboso.structure.decorator.component.Sandwich;
import com.github.gaboso.structure.decorator.component.SimpleSandwich;
import com.github.gaboso.structure.decorator.decorator.DressingDecorator;
import com.github.gaboso.structure.decorator.decorator.MeatDecorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }

}
