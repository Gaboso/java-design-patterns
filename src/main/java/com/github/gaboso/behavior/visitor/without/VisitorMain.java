package com.github.gaboso.behavior.visitor.without;

import com.github.gaboso.behavior.visitor.without.element.Fender;
import com.github.gaboso.behavior.visitor.without.element.Oil;
import com.github.gaboso.behavior.visitor.without.element.PartsOrder;
import com.github.gaboso.behavior.visitor.without.element.Wheel;

public class VisitorMain {

    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        double shippingCost = order.calculateShipping();
        System.out.println("shippingCost = " + shippingCost);
    }

}
