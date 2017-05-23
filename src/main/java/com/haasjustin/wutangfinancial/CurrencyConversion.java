package com.haasjustin.wutangfinancial;

import java.util.HashMap;

/**
 * Created by justinhaas on 5/22/17.
 */
public class CurrencyConversion extends Currency {


    public static HashMap<String, Double> currency = new HashMap<String, Double>();

    public CurrencyConversion() {
        currency.put("USD", 1.00);
        currency.put("EUR", 0.94);
        currency.put("GBP", 0.82);
        currency.put("INR", 68.32);
        currency.put("AUD", 1.35);
        currency.put("CAD", 1.32);
        currency.put("SGD", 1.43);
        currency.put("CHF", 1.01);
        currency.put("MYR", 4.47);
        currency.put("JPY", 115.84);
        currency.put("CNY", 6.92);
    }

}
