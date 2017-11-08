package com.zipCodeWilmington;

public class AustralianDollar extends ExchangeRates {

    public double AustralianDollarToUsDollar(double amount){

        amount/= AUSTRALIANDOLLAR / USDOLAR;

        return amount;
    }
}
