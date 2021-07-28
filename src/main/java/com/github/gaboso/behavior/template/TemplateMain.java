package com.github.gaboso.behavior.template;

import com.github.gaboso.behavior.template.template.OrderTemplate;
import com.github.gaboso.behavior.template.template.StoreOrder;
import com.github.gaboso.behavior.template.template.WebOrder;

public class TemplateMain {

    public static void main(String[] args) {
        System.out.println("Web Order: ");
        OrderTemplate webTemplate = new WebOrder();
        webTemplate.processOrder();

        System.out.println("\nStore Order: ");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }

}
