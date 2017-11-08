package com.zipCodeWilmington;

import java.text.DecimalFormat;


public class USdollar extends ExchangeRates implements Transaction {

    AllAboutScanner allAboutScanner = new AllAboutScanner();
    DecimalFormat decimalFormatter = new DecimalFormat("##.##");

    public double userPrompt() {
        System.out.println("How much would like to change...?");
        double amountToRetire = allAboutScanner.userInput();
        return usDollarAndEuro(amountToRetire);
    }


    public double usDollarAndEuro(double amount) {
        amount *= (EURO * USDOLAR);
        return Double.parseDouble(decimalFormatter.format(amount));

    }

    public double USdollarToBritishPound(double amount) {

        amount /= (BRITISHPOUND / USDOLAR);

        return Double.parseDouble(decimalFormatter.format(amount));
    }

}




