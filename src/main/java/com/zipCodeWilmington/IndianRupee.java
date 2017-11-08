package com.zipCodeWilmington;

import java.text.DecimalFormat;

public class IndianRupee extends ExchangeRates {
    DecimalFormat decimalFormatter = new DecimalFormat("##.##");

    public double userPrompt() {
        System.out.println("How much would like to change...?");
        double amountToRetire = allAboutScanner.userInput();
        return rupeeToCanadianDollar(amountToRetire);

    }

    public double rupeeToCanadianDollar(double amount) {

        amount /= ExchangeRates.CANADIANDOLLAR / ExchangeRates.INDIANRUPEE;

        return Double.parseDouble(decimalFormatter.format(amount));
    }
}
