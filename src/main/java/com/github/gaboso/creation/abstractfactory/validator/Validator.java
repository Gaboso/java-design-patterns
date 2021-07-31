package com.github.gaboso.creation.abstractfactory.validator;

import com.github.gaboso.creation.abstractfactory.product.CreditCard;

public interface Validator {

    boolean isValid(CreditCard creditCard);

}
