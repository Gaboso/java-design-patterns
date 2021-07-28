package com.github.gaboso.behavior.strategy;

import com.github.gaboso.behavior.strategy.context.CreditCard;
import com.github.gaboso.behavior.strategy.strategy.AmexStrategy;
import com.github.gaboso.behavior.strategy.strategy.VisaStrategy;

public class StrategyMain {

    public static void main(String[] args) {
        var amexCard = new CreditCard(new AmexStrategy());
        amexCard.setNumber("341302463579688");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println("Is Amex valid: "+ amexCard.isValid());

        var fakeAmexCard = new CreditCard(new AmexStrategy());
        fakeAmexCard.setNumber("3413024635796881");
        fakeAmexCard.setDate("09/2026");
        fakeAmexCard.setCvv("123");

        System.out.println("Is Fake Amex valid: "+ fakeAmexCard.isValid());

        var visaCard = new CreditCard(new VisaStrategy());
        visaCard.setNumber("4539978020235353");
        visaCard.setDate("03/2027");
        visaCard.setCvv("890");

        System.out.println("Is Visa valid: "+ visaCard.isValid());
    }

}
