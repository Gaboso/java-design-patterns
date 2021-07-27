package com.github.gaboso.behavior.responsibility.receiver;

import com.github.gaboso.behavior.responsibility.PaperCurrency;

public abstract class PaperCurrencyDispenser {

    protected PaperCurrencyDispenser nextDispenser;

    public void setNextDispenser(PaperCurrencyDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    public abstract void dispense(PaperCurrency currency);

}