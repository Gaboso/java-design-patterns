package com.github.gaboso.creation.abstractfactory.factory;

import com.github.gaboso.creation.abstractfactory.product.CardType;
import com.github.gaboso.creation.abstractfactory.product.CreditCard;
import com.github.gaboso.creation.abstractfactory.validator.Validator;

//AbstractFactory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);

}
