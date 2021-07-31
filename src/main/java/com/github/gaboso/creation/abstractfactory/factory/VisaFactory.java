package com.github.gaboso.creation.abstractfactory.factory;

import com.github.gaboso.creation.abstractfactory.product.CardType;
import com.github.gaboso.creation.abstractfactory.product.CreditCard;
import com.github.gaboso.creation.abstractfactory.product.VisaBlackCreditCard;
import com.github.gaboso.creation.abstractfactory.product.VisaGoldCreditCard;
import com.github.gaboso.creation.abstractfactory.validator.Validator;
import com.github.gaboso.creation.abstractfactory.validator.VisaValidator;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();

            case PLATINUM:
                return new VisaBlackCreditCard();

            default:
                return null;

        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }

}
