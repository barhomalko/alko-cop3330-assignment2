/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 barhom alko
 */
package ex26;

import java.util.*;

public class payCalc {

    public static int monthsUntil(double bal, double APR, double pay) {

        APR = APR / 365;
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + bal / pay * (1 - Math.pow(1 + APR, 30))) / Math.log(1 + APR));

    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double bal, APR, pay;

        System.out.print("What is your current balance? ");
        bal = scanner.nextDouble();

        System.out.print("What is the APR on the card in percent? ");
        APR = scanner.nextDouble();
        APR = APR / 100;

        System.out.print("What is your monthly payment? ");
        pay = scanner.nextDouble();

        int months = monthsUntil(bal, APR, pay);
        System.out.println("It will take " + months + " months to pay off this card.");
    }
}