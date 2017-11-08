package com.zipCodeWilmington;

import java.text.DecimalFormat;

public class SingaporeDollar extends ExchangeRates {

    DecimalFormat decimalFormatter = new DecimalFormat("##.##");


    public double userPrompt() {
        System.out.println("How much would like to change...?");
        double amountToRetire = allAboutScanner.userInput();
        return singaporeDollartoSwissFranc(amountToRetire);

    }


    public double singaporeDollartoSwissFranc(double amount) {

        amount /= (ExchangeRates.SWISSFRANC / ExchangeRates.SINGAPOREDOLLAR);

        return Double.parseDouble(decimalFormatter.format(amount));

    }


}
