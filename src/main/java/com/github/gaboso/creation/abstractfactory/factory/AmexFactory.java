package com.github.gaboso.creation.abstractfactory.factory;

import com.github.gaboso.creation.abstractfactory.product.AmexGoldCreditCard;
import com.github.gaboso.creation.abstractfactory.product.AmexPlatinumCreditCard;
import com.github.gaboso.creation.abstractfactory.product.CardType;
import com.github.gaboso.creation.abstractfactory.product.CreditCard;
import com.github.gaboso.creation.abstractfactory.validator.AmexGoldValidator;
import com.github.gaboso.creation.abstractfactory.validator.AmexPlatinumValidator;
import com.github.gaboso.creation.abstractfactory.validator.Validator;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {

        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard();

            case PLATINUM:
                return new AmexPlatinumCreditCard();

            default:
                break;
        }

        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {

        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();

            case PLATINUM:
                return new AmexPlatinumValidator();

            default:
                return null;
        }
    }
}
