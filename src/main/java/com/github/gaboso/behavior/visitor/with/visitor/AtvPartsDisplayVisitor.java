package com.github.gaboso.behavior.visitor.with.visitor;

import com.github.gaboso.behavior.visitor.with.element.Fender;
import com.github.gaboso.behavior.visitor.with.element.Oil;
import com.github.gaboso.behavior.visitor.with.element.PartsOrder;
import com.github.gaboso.behavior.visitor.with.element.Wheel;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {

    @Override
    public void visit(Fender fender) {
        System.out.println("We have a fender.");
    }

    @Override
    public void visit(Oil oil) {
        System.out.println("We have oil.");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("We have a wheel.");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("We have an order.");
    }

}
