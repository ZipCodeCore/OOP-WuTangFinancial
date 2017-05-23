package com.zipcode;

/**
 * Created by vidyachandasekhar on 5/22/17.
 */
public class CurrencyExchange {


    public double convertCurrency(double amount, CurrencyEnum fromCurrency, CurrencyEnum toCurrency) {

        return (amount / fromCurrency.getConversionRate()) * toCurrency.getConversionRate();

    }


}
