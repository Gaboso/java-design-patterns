package com.github.gaboso.behavior.strategy.strategy;

import com.github.gaboso.behavior.strategy.context.CreditCard;

public class VisaStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = creditCard.getNumber().startsWith("4");

        if (isValid) {
            isValid = creditCard.getNumber().length() == 16;
        }

        if (isValid) {
            isValid = passesLuhn(creditCard.getNumber());
        }

        return isValid;
    }

}
