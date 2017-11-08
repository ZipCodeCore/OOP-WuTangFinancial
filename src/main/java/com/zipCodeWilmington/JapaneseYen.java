package com.zipCodeWilmington;

import java.text.DecimalFormat;

public class JapaneseYen extends ExchangeRates {

    DecimalFormat decimalFormatter = new DecimalFormat("##.##");

    public double userPrompt(){
        System.out.println("How much would like to change...?");
        double amountToRetire = allAboutScanner.userInput();
        return japaneseYenToChineseYuanRenminbi(amountToRetire);
    }

    public double japaneseYenToChineseYuanRenminbi(double amount){

        amount *=  ExchangeRates.JAPANESEYEN / ExchangeRates.CHINESEYUANRENMINBI;

        return Double.parseDouble(decimalFormatter.format(amount));
    }
}
