package com.zipCodeWilmington;

import java.text.DecimalFormat;

public class SwissFranc extends ExchangeRates {

    DecimalFormat decimalFormatter = new DecimalFormat("##.##");


    public double userPrompt() {
        System.out.println("How much would like to change...?");
        double amountToRetire = allAboutScanner.userInput();
        return swissFrancToMalaysianRinggit(amountToRetire);

    }


    public double swissFrancToMalaysianRinggit(double amount) {

        amount /= (ExchangeRates.MALAYSIANRINGGIT / ExchangeRates.SWISSFRANC);

        return Double.parseDouble(decimalFormatter.format(amount));

    }
}
