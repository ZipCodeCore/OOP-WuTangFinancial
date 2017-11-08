package io.zipcode.WuTangFinancial;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Currency> currencyArrayList = new ArrayList<Currency>();

    public static void main(String args[]){
        double finalAmount;
        Currency currencyObj = new Currency();
        for (Currency i:Currency.currencyArrayList) {
            System.out.println(i.getName()+" "+i.getRate());
        }
        String baseCurrency = Console.getStringInput("What kind of currency do you have?");
        double sourceAmount = Console.getDoubleInput("Enter the amount you have");
        String targetCurrency= Console.getStringInput("Enter the currency type you want to convert to.");

        finalAmount = currencyObj.toExchangeMoney(sourceAmount,baseCurrency,targetCurrency);
        System.out.println(finalAmount);
    }
}
