package com.zipCodeWilmington;

import java.text.DecimalFormat;

public class CanadianDollar {

    AllAboutScanner allAboutScanner = new AllAboutScanner();
    static DecimalFormat decimalFormatter = new DecimalFormat("##.##");


    public double userPrompt() {
        System.out.println("How much would like to change...?");
        double amountToRetire = allAboutScanner.userInput();
        return canadianDollarToSingaporeDollar(amountToRetire);

    }


    public double canandianDollarToUSdollar(double amount) {

        amount /= ExchangeRates.USDOLAR / ExchangeRates.CANADIANDOLLAR;

        return Double.parseDouble(decimalFormatter.format(amount));
    }

    public double canadianDollarToSingaporeDollar(double amount) {

        amount /= ExchangeRates.SINGAPOREDOLLAR / ExchangeRates.CANADIANDOLLAR;

        return Double.parseDouble(decimalFormatter.format(amount));
    }


}
