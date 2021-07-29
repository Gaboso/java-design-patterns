package com.github.gaboso.behavior.visitor.with;

import com.github.gaboso.behavior.visitor.with.element.Fender;
import com.github.gaboso.behavior.visitor.with.element.Oil;
import com.github.gaboso.behavior.visitor.with.element.PartsOrder;
import com.github.gaboso.behavior.visitor.with.element.Wheel;
import com.github.gaboso.behavior.visitor.with.visitor.AtvPartsDisplayVisitor;
import com.github.gaboso.behavior.visitor.with.visitor.AtvPartsShippingVisitor;

public class VisitorMain {

    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        order.accept(new AtvPartsShippingVisitor());
        order.accept(new AtvPartsDisplayVisitor());
    }

}
