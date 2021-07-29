package com.github.gaboso.behavior.visitor.without.element;

import com.github.gaboso.behavior.visitor.without.AtvPart;

public class Wheel implements AtvPart {

    @Override
    public double calculateShipping() {
        return 12;
    }

}
