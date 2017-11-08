package com.zipCodeWilmington;

import java.text.DecimalFormat;

public class Euro extends ExchangeRates implements Transaction {

    AllAboutScanner allAboutScanner = new AllAboutScanner();
    DecimalFormat decimalFormatter = new DecimalFormat("##.##");


    public double userPrompt() {
        System.out.println("How much would like to change...?");
        double amountToRetire = allAboutScanner.userInput();

        euroToBritishPound(amountToRetire);
        return amountToRetire;
    }

    public double userPrompt2() {
        System.out.println("How much would like to change...?");
        double amountToRetire = allAboutScanner.userInput();

        return euroToUSdollar(amountToRetire);

    }


    public double euroToUSdollar(double amount) {

        amount /= ExchangeRates.USDOLAR / ExchangeRates.EURO;

        return Double.parseDouble(decimalFormatter.format(amount));
    }


    public double euroToBritishPound(double amount) {

        amount /= ExchangeRates.BRITISHPOUND / ExchangeRates.EURO;

        return Double.parseDouble(decimalFormatter.format(amount));
    }


}
