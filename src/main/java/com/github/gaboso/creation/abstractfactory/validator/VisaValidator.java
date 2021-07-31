package com.github.gaboso.creation.abstractfactory.validator;

import com.github.gaboso.creation.abstractfactory.product.CreditCard;

public class VisaValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }

}
