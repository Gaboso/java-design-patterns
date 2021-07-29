package com.github.gaboso.behavior.visitor.with.visitor;

import com.github.gaboso.behavior.visitor.with.element.Fender;
import com.github.gaboso.behavior.visitor.with.element.Oil;
import com.github.gaboso.behavior.visitor.with.element.PartsOrder;
import com.github.gaboso.behavior.visitor.with.element.Wheel;

public interface AtvPartVisitor {

    void visit(Fender fender);

    void visit(Oil oil);

    void visit(Wheel wheel);

    void visit(PartsOrder partsOrder);

}
