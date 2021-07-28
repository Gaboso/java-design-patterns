package com.github.gaboso.behavior.strategy.strategy;

import com.github.gaboso.behavior.strategy.context.CreditCard;

public abstract class ValidationStrategy {

    public abstract boolean isValid(CreditCard creditCard);

    protected boolean passesLuhn(String ccNumber) {
        var alternate = false;
        var sum = 0;

        for (int i = ccNumber.length() - 1; i >= 0; i--) {
            var n = Integer.parseInt(ccNumber.substring(i, i + 1));

            if (alternate) {
                n *= 2;

                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }

        return sum % 10 == 0;
    }

}
