package com.github.gaboso.creation.abstractfactory;

import com.github.gaboso.creation.abstractfactory.factory.CreditCardFactory;
import com.github.gaboso.creation.abstractfactory.product.CardType;
import com.github.gaboso.creation.abstractfactory.product.CreditCard;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);

        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);

        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(card2.getClass());
    }

}
