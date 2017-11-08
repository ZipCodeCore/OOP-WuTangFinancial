package com.zipCodeWilmington;

import java.text.DecimalFormat;

public class BritishPound {

    AllAboutScanner allAboutScanner = new AllAboutScanner();
    DecimalFormat decimalFormatter = new DecimalFormat("##.##");


    public double userPrompt() {
        System.out.println("How much would like to change...?");
        double amountToRetire = allAboutScanner.userInput();
        return britishPoundToIndianRupee(amountToRetire);

    }

    public double britishPoundToIndianRupee(double amount) {

        amount *= ExchangeRates.INDIANRUPEE * ExchangeRates.BRITISHPOUND;

        return Double.parseDouble(decimalFormatter.format(amount));
    }


}
