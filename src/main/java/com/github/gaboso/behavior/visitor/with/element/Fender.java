package com.github.gaboso.behavior.visitor.with.element;

import com.github.gaboso.behavior.visitor.with.visitor.AtvPartVisitor;

public class Fender implements AtvPart {

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }

}
