package com.github.gaboso.behavior.responsibility;

import com.github.gaboso.behavior.responsibility.sender.ATMWithdrawal;

import java.util.Scanner;

public class ResponsibilityMain {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            do {
                System.out.println("Please enter amount to withdraw (multiple of 10, max $1000, Press Ctrl + C to end): ");

                var amount = scanner.nextInt();
                if (isValid(amount)) {
                    ATMWithdrawal.withdraw(new PaperCurrency(amount));
                }

            } while (true);
        }
    }

    private static boolean isValid(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Try again!");
            return false;
        } else if (amount > 1000) {
            System.out.println("Daily withdrawal limit is $1000. Try again!");
            return false;
        } else if (amount % 10 != 0) {
            System.out.println("Amount must be multiple of 10s, Try again!");
            return false;
        }
        return true;
    }

}