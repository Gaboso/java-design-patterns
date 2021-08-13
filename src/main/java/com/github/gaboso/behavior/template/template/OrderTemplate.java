package com.github.gaboso.behavior.template.template;

public abstract class OrderTemplate {

    public boolean isGift;

    public final void processOrder() {
        doCheckout();
        doPayment();
        if (isGift) {
            wrapGift();
        } else {
            doReceipt();
        }

        doDelivery();
    }

    public abstract void doCheckout();

    public abstract void doPayment();

    public final void wrapGift() {
        System.out.println("Gift wrapped.");
    }

    public abstract void doReceipt();

    public abstract void doDelivery();

}
