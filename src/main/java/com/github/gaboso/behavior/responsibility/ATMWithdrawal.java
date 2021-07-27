package com.github.gaboso.behavior.responsibility;

import com.github.gaboso.behavior.responsibility.receiver.FiftyDispenser;
import com.github.gaboso.behavior.responsibility.receiver.HundredDispenser;
import com.github.gaboso.behavior.responsibility.receiver.PaperCurrencyDispenser;
import com.github.gaboso.behavior.responsibility.receiver.TenDispenser;
import com.github.gaboso.behavior.responsibility.receiver.TwentyDispenser;

public class ATMWithdrawal {

    protected static PaperCurrencyDispenser hundredDispenser = new HundredDispenser();
    protected static PaperCurrencyDispenser fiftyDispenser = new FiftyDispenser();
    protected static PaperCurrencyDispenser twentyDispenser = new TwentyDispenser();
    protected static PaperCurrencyDispenser tenDispenser = new TenDispenser();
    protected static PaperCurrencyDispenser dispenserChain;

    static {
        // construct the chain of the currency dispensers in higher to lower denomination
        hundredDispenser.setNextDispenser(fiftyDispenser);
        fiftyDispenser.setNextDispenser(twentyDispenser);
        twentyDispenser.setNextDispenser(tenDispenser);
        dispenserChain = hundredDispenser;
    }

    private ATMWithdrawal() {
    }

    public static void withdraw(PaperCurrency currency) {
        if (currency != null) {
            dispenserChain.dispense(currency);
        }
    }

}