package com.haasjustin.wutangfinancial;


import static com.haasjustin.wutangfinancial.CurrencyConversion.currency;


/**
 * Created by justinhaas on 5/22/17.
 */
public class Currency {

    public static double convertCurrency(double total, String toCurrency, String fromCurrency) {
        double usDollar = convertForeignToDollars(toCurrency, total);
        return convertUSToFinal(fromCurrency, usDollar);
    }

    public static double conversionRate(String rates) {
        return currency.get(rates);
    }

    public static double convertForeignToDollars(String toCurrency, double total) {
        return total / conversionRate(toCurrency);
    }

    public static double convertUSToFinal(String fromCurrency, double total) {
        return total * conversionRate(fromCurrency);
    }
}